package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;

public interface MovieDao {
	List<Movie> listMoviesByGenre(String genre);
	List<Movie> listMoviesByCinema(int cinemaId);
}
