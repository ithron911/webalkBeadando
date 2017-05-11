package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth.webdev.dao.UserDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.UserEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.UserEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDaoImpl() {
	}

	@Override
	public User getUserByLoginDatas(String username) throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, username);
		User user = null;
		
		if (userEntity != null) {
			user = UserEntityConverter.convertUserEntityToModel(userEntity);
		} else {
			throw new InvalidUserException();
		}

		return user;
	}

	@Override
	public void modifyUser(String username, String firstname, String lastname, int age, String email) throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, username);

		if (userEntity != null) {
			userEntity.setAge(age);
			userEntity.setEmail(email);
			userEntity.setFirstname(firstname);
			userEntity.setLastname(lastname);

			this.entityManager.merge(userEntity);
		} else {
			throw new InvalidUserException();
		}
	}

	@Override
	public User getUserByUsername(String username) throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, username);
		User user = null;

		if (userEntity != null) {
			user = UserEntityConverter.convertUserEntityToModel(userEntity);
		} else {
			throw new InvalidUserException();
		}

		return user;
	}

}
