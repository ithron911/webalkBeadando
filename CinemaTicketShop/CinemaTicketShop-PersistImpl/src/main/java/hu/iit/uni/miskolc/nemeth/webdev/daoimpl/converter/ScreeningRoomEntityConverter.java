package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.ScreeningRoomDTO;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ScreeningRoomEntity;

public final class ScreeningRoomEntityConverter {

	private ScreeningRoomEntityConverter() {
	}

	public static ScreeningRoomDTO convertScreeningRoomEntityToDTO(ScreeningRoomEntity screeningRoomEntity) {
		ScreeningRoomDTO screeningRoomDTO = new ScreeningRoomDTO();
		screeningRoomDTO.setId(screeningRoomEntity.getId());
		screeningRoomDTO.setCinema(CinemaEntityConverter.convertCinemaEntityToDto(screeningRoomEntity.getCinema()));

		return screeningRoomDTO;
	}
}
