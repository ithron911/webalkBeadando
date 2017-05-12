package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;

public interface TicketDao {
	void buyTicket(Ticket ticket);

	List<Ticket> getTicketsByUserId(String username);
}
