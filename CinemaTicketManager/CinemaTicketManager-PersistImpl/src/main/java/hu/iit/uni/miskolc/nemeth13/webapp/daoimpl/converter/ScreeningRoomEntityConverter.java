package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.ScreeningRoomDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.ScreeningRoomEntity;

public final class ScreeningRoomEntityConverter {

	private ScreeningRoomEntityConverter() {
	}

	public static List<ScreeningRoomDTO> convertScreeningRoomEntitiesToDTOs(List<ScreeningRoomEntity> screeningRoomEntities) {
		List<ScreeningRoomDTO> screeningRoomDTOs = new ArrayList<>();

		for (ScreeningRoomEntity screeningRoomEntity : screeningRoomEntities) {
			screeningRoomDTOs.add(convertScreeningRoomEntityToDTO(screeningRoomEntity));
		}

		return screeningRoomDTOs;
	}
	public static ScreeningRoomDTO convertScreeningRoomEntityToDTO(ScreeningRoomEntity screeningRoomEntity) {
		ScreeningRoomDTO screeningRoomDTO = new ScreeningRoomDTO();
		screeningRoomDTO.setId(screeningRoomEntity.getId());
		screeningRoomDTO.setCinema(CinemaEntityConverter.convertCinemaEntityToDto(screeningRoomEntity.getCinema()));
		screeningRoomDTO.setSeats(SeatEntityConverter.convertSeatEntitiesToDTOs(screeningRoomEntity.getSeats()));

		return screeningRoomDTO;
	}
}
