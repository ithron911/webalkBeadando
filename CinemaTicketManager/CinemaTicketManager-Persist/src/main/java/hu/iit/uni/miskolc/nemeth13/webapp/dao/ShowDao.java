package hu.iit.uni.miskolc.nemeth13.webapp.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.ShowDTO;

public interface ShowDao {
	List<ShowDTO> listShowsByMovieAndCinemaId(int movieId, int cinemaId);
}
