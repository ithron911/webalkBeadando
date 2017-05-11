package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ScreeningRoomEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.ScreeningRoom;

public final class ScreeningRoomEntityConverter {

	private ScreeningRoomEntityConverter() {
	}

	public static ScreeningRoom convertScreeningRoomEntityToModel(ScreeningRoomEntity screeningRoomEntity) {
		ScreeningRoom screeningRoom = new ScreeningRoom();
		screeningRoom.setId(screeningRoomEntity.getId());
		screeningRoom.setCinema(CinemaEntityConverter.convertCinemaEntityToModel(screeningRoomEntity.getCinema()));

		return screeningRoom;
	}
}
