package hu.iit.uni.miskolc.nemeth.webdev.dao;

import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;

public interface UserDao {
	User getUserByLoginDatas(String username, String password) throws InvalidUserException;

	void modifyUser(User user) throws InvalidUserException;

	User getUSerById(int userId) throws InvalidUserException;
}
