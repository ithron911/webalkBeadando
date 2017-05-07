package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.SeatDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.exception.InvalidSeatException;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.SeatEntity;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository.SeatRepository;

@Repository
@Transactional
public class SeatDaoImpl implements SeatDao{

	private SeatRepository seatRepository;

	@Autowired
	public SeatDaoImpl(SeatRepository seatRepository) {
		this.seatRepository = seatRepository;
	}

	@Override
	public void bookSeat(int seatId) throws InvalidSeatException {
		SeatEntity seatEntity = seatRepository.findOne(seatId);
		validateSeatEntity(seatEntity);

		seatEntity.setTaken(true);

		seatRepository.save(seatEntity);
	}

	private void validateSeatEntity(SeatEntity seatEntity) throws InvalidSeatException {
		if (seatEntity != null) {
			if (seatEntity.isTaken()) {
				throw new InvalidSeatException("The seat is already taken!");
			}
		} else {
			throw new InvalidSeatException("The seat does not exists!");
		}
	}
}
