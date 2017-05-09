package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.MovieDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.MovieDTO;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.MovieEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.MovieEntity;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private EntityManager entityManager;

	public MovieDaoImpl() {
	}
	@Override
	public List<MovieDTO> listMoviesByGenre(String genre) {
		String select = "SELECT m FROM Movie m WHERE m.genre = :genre";
		TypedQuery<MovieEntity> query = this.entityManager.createQuery(select, MovieEntity.class);
		query.setParameter("genre", genre);

		List<MovieEntity> movieEntities = query.getResultList();

		return MovieEntityConverter.convertMovieEntitiesToDTOs(movieEntities);
	}

	@Override
	public List<MovieDTO> listMoviesByCinema(int cinemaId) {
		String select = "SELECT m FROM Movie m WHERE m.cinema.id = :cinemaId";
		TypedQuery<MovieEntity> query = this.entityManager.createQuery(select, MovieEntity.class);
		query.setParameter("cinemaId", cinemaId);

		List<MovieEntity> movieEntities = query.getResultList();

		return MovieEntityConverter.convertMovieEntitiesToDTOs(movieEntities);
	}

}
