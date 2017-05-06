package hu.iit.uni.miskolc.nemeth13.webapp.dao;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.exception.InvalidSeatException;

public interface SeatDao {
	void bookSeat(int seatId) throws InvalidSeatException;
}
