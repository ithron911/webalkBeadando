package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.MovieDao;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.MovieEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.MovieEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

	@PersistenceContext
	private EntityManager entityManager;

	public MovieDaoImpl() {
	}
	@Override
	public List<Movie> listMoviesByGenre(String genre) {
		String select = "SELECT m FROM Movie m WHERE m.genre = :genre";
		TypedQuery<MovieEntity> query = this.entityManager.createQuery(select, MovieEntity.class);
		query.setParameter("genre", genre);

		List<MovieEntity> movieEntities = query.getResultList();

		return MovieEntityConverter.convertMovieEntitiesToModels(movieEntities);
	}

	@Override
	public List<Movie> listMoviesByCinema(int cinemaId) {
		String select = "SELECT m FROM Movie m WHERE m.cinema.id = :cinemaId";
		TypedQuery<MovieEntity> query = this.entityManager.createQuery(select, MovieEntity.class);
		query.setParameter("cinemaId", cinemaId);

		List<MovieEntity> movieEntities = query.getResultList();

		return MovieEntityConverter.convertMovieEntitiesToModels(movieEntities);
	}

}
