package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.ShowDTO;

public interface ShowDao {
	List<ShowDTO> listShowsByMovieAndCinemaId(int movieId, int cinemaId);
}
