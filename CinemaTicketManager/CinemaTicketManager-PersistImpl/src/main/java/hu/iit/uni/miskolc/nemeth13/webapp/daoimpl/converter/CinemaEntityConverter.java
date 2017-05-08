package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.CinemaDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.CinemaEntity;

public final class CinemaEntityConverter {

	private CinemaEntityConverter() {
	}

	public static CinemaDTO convertCinemaEntityToDto(CinemaEntity cinemaEntity) {
		CinemaDTO cinemaDTO = new CinemaDTO();
		cinemaDTO.setId(cinemaEntity.getId());
		cinemaDTO.setAddress(cinemaEntity.getAddress());
		cinemaDTO.setName(cinemaEntity.getName());
		cinemaDTO.setScreeningRooms(ScreeningRoomEntityConverter.convertScreeningRoomEntitiesToDTOs(cinemaEntity.getScreeningRoomEntities()));

		return cinemaDTO;
	}
}
