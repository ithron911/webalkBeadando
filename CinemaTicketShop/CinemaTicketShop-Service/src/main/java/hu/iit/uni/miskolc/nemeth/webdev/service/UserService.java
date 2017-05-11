package hu.iit.uni.miskolc.nemeth.webdev.service;

import hu.iit.uni.miskolc.nemeth.webdev.model.User;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

public interface UserService {
	User getUserByLoginDatas(String username) throws UserNotExistsException;

	void modifyUser(String username, String firstname, String lastname, int age, String email) throws UserNotExistsException;

	User getUserByUsername(String username) throws UserNotExistsException;
}
