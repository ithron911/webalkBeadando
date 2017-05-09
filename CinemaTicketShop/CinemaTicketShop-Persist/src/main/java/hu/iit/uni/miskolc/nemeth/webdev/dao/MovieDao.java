package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.MovieDTO;

public interface MovieDao {
	List<MovieDTO> listMoviesByGenre(String genre);
	List<MovieDTO> listMoviesByCinema(int cinemaId);
}
