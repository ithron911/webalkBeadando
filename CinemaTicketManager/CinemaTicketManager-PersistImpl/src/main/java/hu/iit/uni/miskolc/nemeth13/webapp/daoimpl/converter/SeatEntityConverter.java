package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.SeatDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.SeatEntity;

public final class SeatEntityConverter {

	private SeatEntityConverter() {
	}

	public static List<SeatDTO> convertSeatEntitiesToDTOs(List<SeatEntity> seatEntities) {
		List<SeatDTO> seatDTOs = new ArrayList<>();

		for (SeatEntity seatEntity : seatEntities) {
			seatDTOs.add(convertSeatEntityToDTO(seatEntity));
		}
		return seatDTOs;
	}

	private static SeatDTO convertSeatEntityToDTO(SeatEntity seatEntity) {
		SeatDTO seatDTO = new SeatDTO();
		seatDTO.setId(seatEntity.getId());
		seatDTO.setRowNumber(seatEntity.getRowNumber());
		seatDTO.setSeatNumber(seatEntity.getSeatNumber());
		seatDTO.setTaken(seatEntity.isTaken());
		seatDTO.setScreeningRoom(ScreeningRoomEntityConverter.convertScreeningRoomEntityToDTO(seatEntity.getScreeningRoom()));
		
		return seatDTO;
	}
}
