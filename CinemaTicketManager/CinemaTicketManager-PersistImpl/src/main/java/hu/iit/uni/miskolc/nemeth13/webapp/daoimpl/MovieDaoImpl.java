package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.MovieDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.MovieDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter.MovieEntityConverter;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.MovieEntity;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

	private SessionFactory sessionFactory;

	@Autowired
	public MovieDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<MovieDTO> listMoviesByGenre(String genre) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(MovieEntity.class);
		criteria.add(Restrictions.eq("genre", genre));

		List<MovieEntity> movieEntities = criteria.list();

		return MovieEntityConverter.convertMovieEntitiesToDTOs(movieEntities);
	}

	@Override
	public List<MovieDTO> listMoviesByCinema(int cinemaId) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(MovieEntity.class);
		criteria.add(Restrictions.eq("cinemaId", cinemaId));

		List<MovieEntity> movieEntities = criteria.list();

		return MovieEntityConverter.convertMovieEntitiesToDTOs(movieEntities);
	}

}
