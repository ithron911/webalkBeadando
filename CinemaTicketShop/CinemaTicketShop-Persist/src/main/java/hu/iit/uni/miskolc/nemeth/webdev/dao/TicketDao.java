package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.TicketDTO;

public interface TicketDao {
	void buyTicket(TicketDTO ticketDTO);

	List<TicketDTO> getTicketsByUserId(int userId);
}
