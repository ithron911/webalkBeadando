package hu.iit.uni.miskolc.nemeth.webdev.service;

import hu.iit.uni.miskolc.nemeth.webdev.model.User;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

public interface UserService {
	User getUserByLoginDatas(String username, String password) throws UserNotExistsException;

	void modifyUser(User user) throws UserNotExistsException;
}
