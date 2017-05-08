package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import hu.iit.uni.miskolc.nemeth13.webapp.dao.ShowDao;
import hu.iit.uni.miskolc.nemeth13.webapp.dao.dto.ShowDTO;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.converter.ShowEntityConverter;
import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.ShowEntity;

public class ShowDaoImpl implements ShowDao {

	private SessionFactory sessionFactory;

	@Autowired
	public ShowDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<ShowDTO> listShowsByMovieAndCinemaId(int movieId, int cinemaId) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ShowEntity.class);
		criteria.add(Restrictions.eq("movieId", movieId));
		criteria.add(Restrictions.eq("cinemaId", cinemaId));

		List<ShowEntity> showEntities = criteria.list();

		return ShowEntityConverter.convertShowEntitiesToDTOs(showEntities);
	}

}