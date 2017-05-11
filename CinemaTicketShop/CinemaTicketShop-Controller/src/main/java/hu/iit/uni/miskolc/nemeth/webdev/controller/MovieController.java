package hu.iit.uni.miskolc.nemeth.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;
import hu.iit.uni.miskolc.nemeth.webdev.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	public MovieController() {
	}

	@RequestMapping(value = "/listMovieGenres", method = RequestMethod.GET)
	public List<String> listMovieGenres() {
		return this.movieService.getAllMovieGenres();
	}

	@RequestMapping(value = "/listMoviesByGenre/{genre}", method = RequestMethod.GET)
	public List<Movie> listMoviesByGenre(@PathVariable("genre") String genre) {
		return this.movieService.listMoviesByGenre(genre);
	}
}
