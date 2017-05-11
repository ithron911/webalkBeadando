package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.SeatEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;

public final class SeatEntityConverter {

	private SeatEntityConverter() {
	}

	public static List<Seat> convertSeatEntitiesToModels(List<SeatEntity> seatEntities) {
		List<Seat> seats = new ArrayList<>();

		for (SeatEntity seatEntity : seatEntities) {
			seats.add(convertSeatEntityToModel(seatEntity));
		}
		return seats;
	}

	public static Seat convertSeatEntityToModel(SeatEntity seatEntity) {
		Seat seat = new Seat();
		seat.setId(seatEntity.getId());
		seat.setRowNumber(seatEntity.getRowNumber());
		seat.setSeatNumber(seatEntity.getSeatNumber());
		seat.setTaken(seatEntity.isTaken());
		seat.setScreeningRoom(ScreeningRoomEntityConverter.convertScreeningRoomEntityToModel(seatEntity.getScreeningRoom()));
		
		return seat;
	}
}
