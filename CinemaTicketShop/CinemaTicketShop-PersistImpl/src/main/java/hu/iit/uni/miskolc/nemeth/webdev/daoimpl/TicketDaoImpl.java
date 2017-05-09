package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.TicketDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.TicketDTO;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ShowEntity;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.TicketEntity;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.UserEntity;

@Repository
@Transactional
public class TicketDaoImpl implements TicketDao {

	@Autowired
	private EntityManager entityManager;

	public TicketDaoImpl() {
	}

	@Override
	public void buyTicket(TicketDTO ticketDTO) {
		ShowEntity showEntity = this.entityManager.find(ShowEntity.class, ticketDTO.getShow().getId());
		UserEntity userEntity = this.entityManager.find(UserEntity.class, ticketDTO.getUser().getId());

		TicketEntity ticketEntity = new TicketEntity();
		ticketEntity.setShow(showEntity);
		ticketEntity.setUser(userEntity);

		this.entityManager.persist(ticketEntity);
	}

}
