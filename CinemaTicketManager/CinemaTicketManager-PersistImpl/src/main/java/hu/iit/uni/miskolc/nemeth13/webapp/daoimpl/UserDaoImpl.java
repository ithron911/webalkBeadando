package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.UserDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.UserDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter.UserEntityConverter;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.UserEntity;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository.UserRepository;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	private UserRepository userRepository;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory, UserRepository userRepository) {
		this.sessionFactory = sessionFactory;
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDTO getUserByLoginDatas(String username, String password) throws InvalidUserException {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserEntity.class);
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));

		UserEntity userEntity = (UserEntity) criteria.uniqueResult();

		return UserEntityConverter.convertUserEntityToDTO(userEntity);
	}

	@Override
	public void modifyUser(UserDTO userDTO) throws InvalidUserException {
		UserEntity userEntity = this.userRepository.findOne(userDTO.getId());
		userEntity.setAge(userDTO.getAge());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setFirstname(userDTO.getFirstname());
		userEntity.setLastname(userDTO.getLastname());

		this.userRepository.save(userEntity);
	}

}
