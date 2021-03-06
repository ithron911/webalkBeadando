package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.UserDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;
import hu.iit.uni.miskolc.nemeth.webdev.service.UserService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {
	}

	@Override
	public User getUserByLoginDatas(String username) throws UserNotExistsException {
		User user = null;

		try {
			user = this.userDao.getUserByLoginDatas(username);
		} catch (InvalidUserException e) {
			throw new UserNotExistsException();
		}

		return user;
	}

	@Override
	public void modifyUser(String username, String firstname, String lastname, int age, String email) throws UserNotExistsException {
		try {
			this.userDao.modifyUser(username, firstname, lastname, age, email);
		} catch (InvalidUserException e) {
			throw new UserNotExistsException();
		}
	}

	@Override
	public User getUserByUsername(String username) throws UserNotExistsException {
		User user = null;

		try {
			user = this.userDao.getUserByUsername(username);
		} catch (InvalidUserException e) {
			throw new UserNotExistsException();
		}

		return user;
	}

}
