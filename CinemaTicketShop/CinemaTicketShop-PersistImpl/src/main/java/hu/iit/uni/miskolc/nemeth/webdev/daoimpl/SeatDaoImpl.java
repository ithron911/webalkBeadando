package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.SeatDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidSeatException;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.SeatEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.SeatEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;

@Repository
@Transactional
public class SeatDaoImpl implements SeatDao {

	@PersistenceContext
	private EntityManager entityManager;

	public SeatDaoImpl() {
	}

	@Override
	public void bookSeat(int seatId) throws InvalidSeatException {
		SeatEntity seatEntity = this.entityManager.find(SeatEntity.class, seatId);

		if (seatEntity != null) {
			seatEntity.setTaken(true);

			this.entityManager.merge(seatEntity);
		} else {
			throw new InvalidSeatException();
		}
	}

	@Override
	public List<Seat> listSeatsByScreeningRoom(int screeningRoomId) {
		String select = "SELECT s FROM Seat s WHERE s.screeningRoom.id = :screeningRoomId";
		TypedQuery<SeatEntity> query = this.entityManager.createQuery(select, SeatEntity.class);
		query.setParameter("screeningRoomId", screeningRoomId);

		List<SeatEntity> seatEntities = query.getResultList();

		return SeatEntityConverter.convertSeatEntitiesToModels(seatEntities);
	}

	@Override
	public boolean isSeatTaken(int seatId) throws InvalidSeatException {
		boolean isSeatTaken = false;
		SeatEntity seatEntity = this.entityManager.find(SeatEntity.class, seatId);

		if (seatEntity != null) {
			isSeatTaken = seatEntity.isTaken();
		} else {
			throw new InvalidSeatException();
		}

		return isSeatTaken;
	}

}
