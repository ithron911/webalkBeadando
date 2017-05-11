package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.UserEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;

public final class UserEntityConverter {

	private UserEntityConverter() {
	}

	public static User convertUserEntityToModel (UserEntity userEntity) {
		User user = new User();
		user.setId(userEntity.getId());
		user.setAge(userEntity.getAge());
		user.setEmail(userEntity.getEmail());
		user.setFirstname(userEntity.getFirstname());
		user.setLastname(userEntity.getLastname());
		user.setUsername(userEntity.getUsername());
		user.setPassword(userEntity.getPassword());
		user.setEnabled(userEntity.isEnabled());

		return user;
	}
}
