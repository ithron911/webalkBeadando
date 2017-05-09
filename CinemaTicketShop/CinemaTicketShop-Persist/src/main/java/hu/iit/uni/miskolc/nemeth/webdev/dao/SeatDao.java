package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.SeatDTO;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidSeatException;

public interface SeatDao {
	void bookSeat(int seatId) throws InvalidSeatException;

	List<SeatDTO> listSeatsByScreeningRoom(int screeningRoomId);
}
