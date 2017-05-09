package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import hu.iit.uni.miskolc.nemeth.webdev.dao.UserDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.UserDTO;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.UserEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.UserEntity;

public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager entityManager;

	public UserDaoImpl() {
	}

	@Override
	public UserDTO getUserByLoginDatas(String username, String password) throws InvalidUserException {
		String select = "SELECT u FROM Users u WHERE u.username = :username AND u.password = :password";
		TypedQuery<UserEntity> query = this.entityManager.createQuery(select, UserEntity.class);
		query.setParameter("username", username);
		query.setParameter("password", password);

		UserEntity userEntity = query.getSingleResult();

		return UserEntityConverter.convertUserEntityToDTO(userEntity);
	}

	@Override
	public void modifyUser(UserDTO userDTO) throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, userDTO.getId());
		userEntity.setAge(userDTO.getAge());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setFirstname(userDTO.getFirstname());
		userEntity.setLastname(userDTO.getLastname());

		this.entityManager.merge(userEntity);
	}

}