package hu.iit.uni.miskolc.nemeth.webdev.controller.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.controller.model.TicketResponse;
import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;

public final class TicketConverter {

	private TicketConverter() {
	}

	public static List<TicketResponse> convertTicketModelssToTicketResponses(List<Ticket> tickets) {
		List<TicketResponse> ticketResponses = new ArrayList<>();

		for (Ticket ticket : tickets) {
			ticketResponses.add(convertTicketModelToTicketResponse(ticket));
		}

		return ticketResponses;
	}

	private static TicketResponse convertTicketModelToTicketResponse(Ticket ticket) {
		TicketResponse ticketResponse = new TicketResponse();
		ticketResponse.setId(ticket.getId());
		ticketResponse.setSeat(ticket.getSeat());
		ticketResponse.setUser(ticket.getUser());
		ticketResponse.setShow(ShowConverter.convertShowModelToResponse(ticket.getShow()));

		return ticketResponse;
	}
}
