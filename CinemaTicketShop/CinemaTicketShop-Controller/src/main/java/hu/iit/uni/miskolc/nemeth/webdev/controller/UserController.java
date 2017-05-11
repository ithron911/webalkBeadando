package hu.iit.uni.miskolc.nemeth.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.controller.model.UserDetailsRequest;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;
import hu.iit.uni.miskolc.nemeth.webdev.service.UserService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {
	}

	@RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
	public User getUserDetails()throws UserNotExistsException {
		String username = getUsername();

		return this.userService.getUserByLoginDatas(username);
	}

	@RequestMapping(value = "/modifyUser", method = RequestMethod.POST)
	public void modifyUser(@RequestBody UserDetailsRequest userDetailsRequest) throws UserNotExistsException {
		String username = getUsername();
		this.userService.modifyUser(
			username,
			userDetailsRequest.getFirstname(),
			userDetailsRequest.getLastname(),
			userDetailsRequest.getAge(),
			userDetailsRequest.getEmail()
		);
	}


	private String getUsername() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		return auth.getName();
	}
}
