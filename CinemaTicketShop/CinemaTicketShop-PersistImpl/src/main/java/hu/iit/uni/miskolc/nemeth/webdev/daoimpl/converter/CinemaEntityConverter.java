package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.CinemaDTO;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.CinemaEntity;

public final class CinemaEntityConverter {

	private CinemaEntityConverter() {
	}

	public static CinemaDTO convertCinemaEntityToDto(CinemaEntity cinemaEntity) {
		CinemaDTO cinemaDTO = new CinemaDTO();
		cinemaDTO.setId(cinemaEntity.getId());
		cinemaDTO.setAddress(cinemaEntity.getAddress());
		cinemaDTO.setName(cinemaEntity.getName());

		return cinemaDTO;
	}
}
