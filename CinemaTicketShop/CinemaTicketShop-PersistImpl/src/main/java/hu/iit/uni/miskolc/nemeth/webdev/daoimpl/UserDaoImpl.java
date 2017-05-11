package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import hu.iit.uni.miskolc.nemeth.webdev.dao.UserDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.UserEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.UserEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;

public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDaoImpl() {
	}

	@Override
	public User getUserByLoginDatas(String username, String password) throws InvalidUserException {
		String select = "SELECT u FROM User u WHERE u.username = :username AND u.password = :password";
		TypedQuery<UserEntity> query = this.entityManager.createQuery(select, UserEntity.class);
		query.setParameter("username", username);
		query.setParameter("password", password);

		UserEntity userEntity = query.getSingleResult();

		return UserEntityConverter.convertUserEntityToModel(userEntity);
	}

	@Override
	public void modifyUser(User userDTO) throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, userDTO.getId());

		if (userEntity != null) {
			userEntity.setAge(userDTO.getAge());
			userEntity.setEmail(userDTO.getEmail());
			userEntity.setFirstname(userDTO.getFirstname());
			userEntity.setLastname(userDTO.getLastname());

			this.entityManager.merge(userEntity);
		} else {
			throw new InvalidUserException("Az adatok mentése sikertelen volt!");
		}
	}

}
