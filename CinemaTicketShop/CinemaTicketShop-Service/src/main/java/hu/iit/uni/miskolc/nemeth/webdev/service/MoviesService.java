package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;

public interface MoviesService {
	List<Movie> listMoviesByGenre(String genre);
	List<Movie> listMoviesByCinema(int cinemaId);
}
