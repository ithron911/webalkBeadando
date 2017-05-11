package hu.iit.uni.miskolc.nemeth.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;

	public TicketController() {
	}

	
}
