package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.TicketEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Ticket;

public final class TicketEntityConverter {

	private TicketEntityConverter() {
	}

	public static List<Ticket> convertTicketEntitiesToModels(List<TicketEntity> ticketEntities) {
		List<Ticket> tickets = new ArrayList<>();

		for (TicketEntity ticketEntity : ticketEntities) {
			tickets.add(convertTicketEntityToModel(ticketEntity));
		}

		return tickets;
	}

	private static Ticket convertTicketEntityToModel(TicketEntity ticketEntity) {
		Ticket ticket = new Ticket();
		ticket.setId(ticketEntity.getId());
		ticket.setSeat(SeatEntityConverter.convertSeatEntityToModel(ticketEntity.getSeatEntity()));
		ticket.setShow(ShowEntityConverter.convertShowEntityToModel(ticketEntity.getShow()));
		ticket.setUser(UserEntityConverter.convertUserEntityToModel(ticketEntity.getUser()));

		return ticket;
	}
}
