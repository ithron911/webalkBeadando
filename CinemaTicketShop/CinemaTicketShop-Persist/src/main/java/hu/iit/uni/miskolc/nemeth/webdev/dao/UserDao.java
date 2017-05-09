package hu.iit.uni.miskolc.nemeth.webdev.dao;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.UserDTO;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidUserException;

public interface UserDao {
	UserDTO getUserByLoginDatas(String username, String password) throws InvalidUserException;

	void modifyUser(UserDTO userDTO) throws InvalidUserException;
}
