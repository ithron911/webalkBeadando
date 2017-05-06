package hu.iit.uni.miskolc.nemeth13.webapp.dao;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.UserDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.exception.InvalidUserException;

public interface UserDao {
	UserDTO getUserByLoginDatas(String username, String password) throws InvalidUserException;

	void modifyUser(UserDTO userDTO) throws InvalidUserException;
}
