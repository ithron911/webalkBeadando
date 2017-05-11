package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.TicketDao;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.TicketEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.SeatEntity;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ShowEntity;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.TicketEntity;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.UserEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;

@Repository
@Transactional
public class TicketDaoImpl implements TicketDao {

	@PersistenceContext
	private EntityManager entityManager;

	public TicketDaoImpl() {
	}

	@Override
	public void buyTicket(Ticket ticketDTO) {
		ShowEntity showEntity = this.entityManager.find(ShowEntity.class, ticketDTO.getShow().getId());
		UserEntity userEntity = this.entityManager.find(UserEntity.class, ticketDTO.getUser().getUsername());
		SeatEntity seatEntity = this.entityManager.find(SeatEntity.class, ticketDTO.getSeat().getId());

		TicketEntity ticketEntity = new TicketEntity();
		ticketEntity.setShow(showEntity);
		ticketEntity.setUser(userEntity);
		ticketEntity.setSeatEntity(seatEntity);

		this.entityManager.persist(ticketEntity);
	}

	@Override
	public List<Ticket> getTicketsByUserId(int userId) {
		String select = "SELECT t from Ticket t WHERE t.user.id = :userId";
		TypedQuery<TicketEntity> query = this.entityManager.createQuery(select, TicketEntity.class);
		query.setParameter("userId", userId);

		List<TicketEntity> ticketEntities = query.getResultList();
		return TicketEntityConverter.convertTicketEntitiesToModels(ticketEntities);
	}

}
