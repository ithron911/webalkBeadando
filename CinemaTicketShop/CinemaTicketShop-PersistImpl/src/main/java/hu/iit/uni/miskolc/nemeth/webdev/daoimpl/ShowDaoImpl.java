package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.ShowDao;
import hu.iit.uni.miskolc.nemeth.webdev.dao.dto.ShowDTO;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.ShowEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ShowEntity;

@Repository
@Transactional
public class ShowDaoImpl implements ShowDao {

	@Autowired
	private EntityManager entityManager;

	public ShowDaoImpl() {
	}

	@Override
	public List<ShowDTO> listShowsByMovieAndCinemaId(int movieId, int cinemaId) {
		String select = "SELECT s FROM Shows s WHERE s.movie.id = :movieId AND s.cinema.id = :cinemaId";
		TypedQuery<ShowEntity> query = this.entityManager.createQuery(select, ShowEntity.class);
		query.setParameter("movieId", movieId);
		query.setParameter("cinemaId", cinemaId);

		List<ShowEntity> showEntities = query.getResultList();

		return ShowEntityConverter.convertShowEntitiesToDTOs(showEntities);
	}

}
