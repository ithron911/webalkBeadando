package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;
import hu.iit.uni.miskolc.nemeth.webdev.model.MovieGenre;

public interface MovieDao {
	List<Movie> listMoviesByGenre(MovieGenre genre);
	List<Movie> listMoviesByCinema(int cinemaId);
}
