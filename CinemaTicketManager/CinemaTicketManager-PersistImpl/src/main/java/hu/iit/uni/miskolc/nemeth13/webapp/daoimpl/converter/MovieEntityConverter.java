package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.MovieDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.MovieEntity;

public final class MovieEntityConverter {

	private MovieEntityConverter() {
	}

	public static List<MovieDTO> convertMovieEntitiesToDTOs(List<MovieEntity> movieEntities) {
		List<MovieDTO> movieDTOs = new ArrayList<>();

		for (MovieEntity movieEntity : movieEntities) {
			movieDTOs.add(convertMovieEntityToDTO(movieEntity));
		}
		return movieDTOs;
	}

	private static MovieDTO convertMovieEntityToDTO(MovieEntity movieEntity) {
		MovieDTO movieDTO = new MovieDTO();
		movieDTO.setId(movieEntity.getId());
		movieDTO.setAgeResctriction(movieEntity.getAgeResctriction());
		movieDTO.setCost(movieEntity.getCost());
		movieDTO.setGenre(movieEntity.getGenre());
		movieDTO.setScreenType(movieEntity.getScreenType());
		movieDTO.setTitle(movieEntity.getScreenType());

		return movieDTO;
	}
}
