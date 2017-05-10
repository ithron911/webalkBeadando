package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.TicketDTO;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.TicketEntity;

public final class TicketEntityConverter {

	private TicketEntityConverter() {
	}

	public static List<TicketDTO> convertTicketEntitiesToDTOs(List<TicketEntity> ticketEntities) {
		List<TicketDTO> ticketDTOs = new ArrayList<>();

		for (TicketEntity ticketEntity : ticketEntities) {
			ticketDTOs.add(convertTicketEntityToDTO(ticketEntity));
		}

		return ticketDTOs;
	}

	private static TicketDTO convertTicketEntityToDTO(TicketEntity ticketEntity) {
		TicketDTO ticketDTO = new TicketDTO();
		ticketDTO.setId(ticketEntity.getId());
		ticketDTO.setSeatDTO(SeatEntityConverter.convertSeatEntityToDTO(ticketEntity.getSeatEntity()));
		ticketDTO.setShow(ShowEntityConverter.convertShowEntityToDTO(ticketEntity.getShow()));
		ticketDTO.setUser(UserEntityConverter.convertUserEntityToDTO(ticketEntity.getUser()));

		return ticketDTO;
	}
}
