package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;

public interface TicketService {
	void buyTicket(Ticket ticket);

	List<Ticket> getTicketsByUserId(int userId);
}
