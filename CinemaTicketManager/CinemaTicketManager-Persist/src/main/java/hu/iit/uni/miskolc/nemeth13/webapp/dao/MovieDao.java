package hu.iit.uni.miskolc.nemeth13.webapp.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.MovieDTO;

public interface MovieDao {
	List<MovieDTO> listMoviesByGenre(String genre);
	List<MovieDTO> listMoviesByCinema(int cinemaId);
}
