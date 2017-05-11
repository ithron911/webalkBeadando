package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.InvalidTicketResourcesException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;

public interface TicketService {
	void buyTicket(int userId, int showId, int seatId) throws InvalidTicketResourcesException, SeatBookedException;

	List<Ticket> getTicketsByUserId(int userId);
}
