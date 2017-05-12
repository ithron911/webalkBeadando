package hu.iit.uni.miskolc.nemeth.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.controller.converter.TicketConverter;
import hu.iit.uni.miskolc.nemeth.webdev.controller.model.TicketRequest;
import hu.iit.uni.miskolc.nemeth.webdev.controller.model.TicketResponse;
import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;
import hu.iit.uni.miskolc.nemeth.webdev.service.TicketService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.InvalidTicketResourcesException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;

	public TicketController() {
	}

	@RequestMapping(value = "/buyTicket", method = RequestMethod.POST)
	public void buyTicket(@RequestBody TicketRequest ticketRequest) throws InvalidTicketResourcesException, SeatBookedException {
		this.ticketService.buyTicket(getUsername(), ticketRequest.getShowId(), ticketRequest.getSeatId());
	}

	@RequestMapping(value = "/getTicketsByUser", method = RequestMethod.GET)
	List<TicketResponse> getTicketsByUserId() {
		List<Ticket> tickets = this.ticketService.getTicketsByUserId(getUsername());

		return TicketConverter.convertTicketModelssToTicketResponses(tickets);
	}

	private String getUsername() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		return auth.getName();
	}
}
