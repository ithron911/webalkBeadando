package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidSeatException;
import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;

public interface SeatDao {
	void bookSeat(int seatId) throws InvalidSeatException;

	List<Seat> listSeatsByScreeningRoom(int screeningRoomId);
}
