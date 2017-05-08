package hu.iit.uni.miskolc.nemeth13.webapp.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.SeatDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.exception.InvalidSeatException;

public interface SeatDao {
	void bookSeat(int seatId) throws InvalidSeatException;

	List<SeatDTO> listSeatsByScreeningRoom(int screeningRoomId);
}
