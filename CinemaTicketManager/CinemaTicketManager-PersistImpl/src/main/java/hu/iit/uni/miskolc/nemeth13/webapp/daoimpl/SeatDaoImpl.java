package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.SeatDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.SeatDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.exception.InvalidSeatException;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter.SeatEntityConverter;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.SeatEntity;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository.SeatRepository;

@Repository
@Transactional
public class SeatDaoImpl implements SeatDao{

	private SessionFactory sessionFactory;
	private SeatRepository seatRepository;

	@Autowired
	public SeatDaoImpl(SessionFactory sessionFactory, SeatRepository seatRepository) {
		this.sessionFactory = sessionFactory;
		this.seatRepository = seatRepository;
	}

	@Override
	public void bookSeat(int seatId) throws InvalidSeatException {
		SeatEntity seatEntity = seatRepository.findOne(seatId);
		validateSeatEntity(seatEntity);

		seatEntity.setTaken(true);

		seatRepository.save(seatEntity);
	}

	@Override
	public List<SeatDTO> listSeatsByScreeningRoom(int screeningRoomId) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(SeatEntity.class);
		criteria.add(Restrictions.eq("screeningRoomId", screeningRoomId));

		List<SeatEntity> seatEntities = criteria.list();

		return SeatEntityConverter.convertSeatEntitiesToDTOs(seatEntities);
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
