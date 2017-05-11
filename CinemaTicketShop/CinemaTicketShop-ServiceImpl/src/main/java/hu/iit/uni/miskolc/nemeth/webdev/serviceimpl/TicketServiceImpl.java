package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.TicketDao;
import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;
import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;
import hu.iit.uni.miskolc.nemeth.webdev.service.SeatService;
import hu.iit.uni.miskolc.nemeth.webdev.service.ShowService;
import hu.iit.uni.miskolc.nemeth.webdev.service.TicketService;
import hu.iit.uni.miskolc.nemeth.webdev.service.UserService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.InvalidTicketResourcesException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatNotExistsException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.ShowNotExistsException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao ticketDao;

	@Autowired
	private UserService userService;

	@Autowired
	private ShowService showService;

	@Autowired
	private SeatService seatService;

	public TicketServiceImpl() {
	}

	@Override
	public void buyTicket(int userId, int showId, int seatId) throws InvalidTicketResourcesException, SeatBookedException {
		try {
			User user = this.userService.getUserByUserId(userId);
			Show show = this.showService.getShowById(showId);
			Seat seat = this.seatService.getSeatById(seatId);

			this.seatService.bookSeat(seatId);

			Ticket ticket = new Ticket();
			ticket.setUser(user);
			ticket.setSeat(seat);
			ticket.setShow(show);

			this.ticketDao.buyTicket(ticket);
		} catch (UserNotExistsException | ShowNotExistsException | SeatNotExistsException e) {
			throw new InvalidTicketResourcesException();
		}
	}

	@Override
	public List<Ticket> getTicketsByUserId(int userId) {
		return this.ticketDao.getTicketsByUserId(userId);
	}

}
