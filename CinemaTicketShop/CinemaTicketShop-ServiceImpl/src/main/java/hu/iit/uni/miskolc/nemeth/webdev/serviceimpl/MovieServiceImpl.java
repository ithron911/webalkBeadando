package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.MovieDao;
import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;
import hu.iit.uni.miskolc.nemeth.webdev.model.MovieGenre;
import hu.iit.uni.miskolc.nemeth.webdev.service.MovieService;
import hu.iit.uni.miskolc.nemeth.webdev.serviceimpl.converter.MovieGenreEnumConverter;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;

	public MovieServiceImpl() {
	}

	@Override
	public List<Movie> listMoviesByGenre(String genre) {
		MovieGenre movieGenre = MovieGenreEnumConverter.convertStringToMovieGenres(genre);
		return this.movieDao.listMoviesByGenre(movieGenre);
	}

	@Override
	public List<Movie> listMoviesByCinema(int cinemaId) {
		return this.movieDao.listMoviesByCinema(cinemaId);
	}

	@Override
	public List<String> getAllMovieGenres() {
		List<String> movieGenres = new ArrayList<>();
		movieGenres.add(MovieGenre.ACTION.toString());
		movieGenres.add(MovieGenre.ADVENTURE.toString());
		movieGenres.add(MovieGenre.ANIMATION.toString());
		movieGenres.add(MovieGenre.FANTASY.toString());
		movieGenres.add(MovieGenre.HORROR.toString());
		movieGenres.add(MovieGenre.SCI_FI.toString());

		return movieGenres;
	}
}
