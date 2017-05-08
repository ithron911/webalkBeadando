package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.TicketDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.TicketDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.ShowEntity;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.TicketEntity;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.UserEntity;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository.ShowRepository;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository.TicketRepository;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository.UserRepository;

@Repository
@Transactional
public class TicketDaoImpl implements TicketDao {

	private TicketRepository ticketRepository;
	private ShowRepository showRepository;
	private UserRepository userRepository;

	@Autowired
	public TicketDaoImpl(
		TicketRepository ticketRepository,
		ShowRepository showRepository,
		UserRepository userRepository
	) {
		this.ticketRepository = ticketRepository;
		this.showRepository = showRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void buyTicket(TicketDTO ticketDTO) {
		TicketEntity ticketEntity = createTicketEntity(ticketDTO);

		this.ticketRepository.save(ticketEntity);
	}

	private TicketEntity createTicketEntity(TicketDTO ticketDTO) {
		ShowEntity showEntity = this.showRepository.findOne(ticketDTO.getShow().getId());
		UserEntity userEntity = this.userRepository.findOne(ticketDTO.getUser().getId());
		
		TicketEntity ticketEntity = new TicketEntity();
		ticketEntity.setShow(showEntity);
		ticketEntity.setUser(userEntity);

		return ticketEntity;
	}
}
