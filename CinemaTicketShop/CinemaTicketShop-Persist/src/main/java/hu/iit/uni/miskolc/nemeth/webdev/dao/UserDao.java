package hu.iit.uni.miskolc.nemeth.webdev.dao;

import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;

public interface UserDao {
	User getUserByLoginDatas(String username) throws InvalidUserException;

	void modifyUser(String username, String firstname, String lastname, int age, String email) throws InvalidUserException;

	User getUserByUsername(String username) throws InvalidUserException;
}
