package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.UserDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.UserEntity;

public final class UserEntityConverter {

	private UserEntityConverter() {
	}

	public static UserDTO convertUserEntityToDTO(UserEntity userEntity) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(userEntity.getId());
		userDTO.setAge(userEntity.getAge());
		userDTO.setEmail(userEntity.getEmail());
		userDTO.setFirstname(userEntity.getFirstname());
		userDTO.setLastname(userEntity.getLastname());

		return userDTO;
	}
}
