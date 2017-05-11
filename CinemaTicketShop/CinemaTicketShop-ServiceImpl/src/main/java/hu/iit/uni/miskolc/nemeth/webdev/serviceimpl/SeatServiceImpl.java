package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.SeatDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidSeatException;
import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;
import hu.iit.uni.miskolc.nemeth.webdev.service.SeatService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatNotExistsException;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	private SeatDao seatDao;

	public SeatServiceImpl() {
	}

	@Override
	public void bookSeat(int seatId) throws SeatBookedException, SeatNotExistsException {
		try {
			boolean isSeatTaken = this.seatDao.isSeatTaken(seatId);
			if (!isSeatTaken) {
				this.seatDao.bookSeat(seatId);
			} else {
				throw new SeatBookedException();
			}
		} catch (InvalidSeatException e) {
			throw new SeatNotExistsException();
		}
	}

	@Override
	public List<Seat> listSeatsByShow(int showId) {
		return this.seatDao.listSeatsByShowId(showId);
	}

}
