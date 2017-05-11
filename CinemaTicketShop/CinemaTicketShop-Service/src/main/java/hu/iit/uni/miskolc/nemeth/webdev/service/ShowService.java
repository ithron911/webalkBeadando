package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Show;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.ShowNotExistsException;

public interface ShowService {
	List<Show> listShowsByMovie(int movieId);

	Show getShowById(int showId) throws ShowNotExistsException;
}
