package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.ShowDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.ShowEntity;

public final class ShowEntityConverter {

	private ShowEntityConverter() {
	}

	public static List<ShowDTO> convertShowEntitiesToDTOs(List<ShowEntity> showEntities) {
		List<ShowDTO> showDTOs = new ArrayList<>();

		 for (ShowEntity showEntity : showEntities) {
			 showDTOs.add(convertShowEntityToDTO(showEntity));
		 }

		return showDTOs;
	}

	private static ShowDTO convertShowEntityToDTO(ShowEntity showEntity) {
		ShowDTO showDTO = new ShowDTO();
		showDTO.setId(showEntity.getId());
		showDTO.setCinema(CinemaEntityConverter.convertCinemaEntityToDto(showEntity.getCinema()));
		showDTO.setDate(showEntity.getDate());
		showDTO.setMovie(MovieEntityConverter.convertMovieEntityToDTO(showEntity.getMovie()));
		

		return showDTO;
	}
}
