package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidSeatException;
import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;

public interface SeatDao {
	void bookSeat(int seatId) throws InvalidSeatException;

	List<Seat> listSeatsByShowId(int showId);

	boolean isSeatTaken(int seatId) throws InvalidSeatException;

	Seat getSeatById(int seatId) throws InvalidSeatException;
}
