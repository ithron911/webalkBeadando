package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.MovieEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;

public final class MovieEntityConverter {

	private MovieEntityConverter() {
	}

	public static List<Movie> convertMovieEntitiesToModels(List<MovieEntity> movieEntities) {
		List<Movie> movie = new ArrayList<>();

		for (MovieEntity movieEntity : movieEntities) {
			movie.add(convertMovieEntityToModels(movieEntity));
		}
		return movie;
	}

	public static Movie convertMovieEntityToModels(MovieEntity movieEntity) {
		Movie movie = new Movie();
		movie.setId(movieEntity.getId());
		movie.setAgeResctriction(movieEntity.getAgeResctriction());
		movie.setCost(movieEntity.getCost());
		movie.setGenre(movieEntity.getGenre());
		movie.setScreenType(movieEntity.getScreenType());
		movie.setTitle(movieEntity.getTitle());

		return movie;
	}
}
