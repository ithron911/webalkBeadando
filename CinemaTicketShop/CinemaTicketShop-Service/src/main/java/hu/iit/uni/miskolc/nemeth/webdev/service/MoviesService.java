package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;

public interface MoviesService {
	void bookSeat(int seatId) throws SeatBookedException;

	List<Seat> listSeatsByScreeningRoom(int screeningRoomId);
}
