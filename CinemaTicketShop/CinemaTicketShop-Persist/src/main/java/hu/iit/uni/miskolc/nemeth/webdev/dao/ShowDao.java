package hu.iit.uni.miskolc.nemeth.webdev.dao;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.dao.exception.InvalidShowException;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;

public interface ShowDao {
	List<Show> listShowsByMovie(int movieId);

	Show getShowById(int showId) throws InvalidShowException;
}
