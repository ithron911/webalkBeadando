package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.MovieDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.MovieDTO;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MovieDaoImpl() {
	}

	@Override
	public List<MovieDTO> listMoviesByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieDTO> listMoviesByCinema(int cinemaId) {
		// TODO Auto-generated method stub
		return null;
	}

}
