package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;
import hu.iit.uni.miskolc.nemeth.webdev.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketService ticketService;

	public TicketServiceImpl() {
	}

	@Override
	public void buyTicket(Ticket ticket) {
		this.ticketService.buyTicket(ticket);
	}

	@Override
	public List<Ticket> getTicketsByUserId(int userId) {
		return ticketService.getTicketsByUserId(userId);
	}

}
