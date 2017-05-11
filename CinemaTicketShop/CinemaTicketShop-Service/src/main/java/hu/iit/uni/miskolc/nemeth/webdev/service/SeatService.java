package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatNotExistsException;

public interface SeatService {
	void bookSeat(int seatId) throws SeatBookedException, SeatNotExistsException;

	List<Seat> listSeatsByShow(int showId);

	Seat getSeatById(int seatId) throws SeatNotExistsException;
}
