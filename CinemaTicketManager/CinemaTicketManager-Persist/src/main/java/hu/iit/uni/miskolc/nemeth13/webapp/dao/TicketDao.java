package hu.iit.uni.miskolc.nemeth13.webapp.dao;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.TicketDTO;

public interface TicketDao {
	void buyTicket(TicketDTO ticketDTO);
}
