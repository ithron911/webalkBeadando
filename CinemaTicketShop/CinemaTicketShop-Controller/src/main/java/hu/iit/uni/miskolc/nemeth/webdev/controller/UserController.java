package hu.iit.uni.miskolc.nemeth.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.model.User;
import hu.iit.uni.miskolc.nemeth.webdev.service.UserService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {
	}

	@RequestMapping(value = "/getUserByLoginDatas", method = RequestMethod.POST)
	public User getUserByLoginDatas(
		@RequestParam("username") String username,
		@RequestParam("password") String password
	)throws UserNotExistsException {
		return this.userService.getUserByLoginDatas(username, password);
	}
}
