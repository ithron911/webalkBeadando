package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.uni.miskolc.nemeth.webdev.dao.MovieDao;
import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;
import hu.iit.uni.miskolc.nemeth.webdev.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;

	public MovieServiceImpl() {
	}

	@Override
	public List<Movie> listMoviesByGenre(String genre) {
		return this.movieDao.listMoviesByGenre(genre);
	}

	@Override
	public List<Movie> listMoviesByCinema(int cinemaId) {
		return this.movieDao.listMoviesByCinema(cinemaId);
	}
}
