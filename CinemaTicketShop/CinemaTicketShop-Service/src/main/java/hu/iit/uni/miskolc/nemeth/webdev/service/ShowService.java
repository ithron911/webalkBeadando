package hu.iit.uni.miskolc.nemeth.webdev.service;

import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.model.Show;

public interface ShowService {
	List<Show> listShowsByMovie(int movieId);
}
