package hu.iit.uni.miskolc.nemeth.webdev.dao;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.TicketDTO;

public interface TicketDao {
	void buyTicket(TicketDTO ticketDTO);
}
