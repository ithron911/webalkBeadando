package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.ShowDao;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.ShowEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ShowEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;

@Repository
@Transactional
public class ShowDaoImpl implements ShowDao {

	@PersistenceContext
	private EntityManager entityManager;

	public ShowDaoImpl() {
	}

	@Override
	public List<Show> listShowsByMovie(int movieId) {
		String select = "SELECT s FROM Show s WHERE s.movie.id = :movieId";
		TypedQuery<ShowEntity> query = this.entityManager.createQuery(select, ShowEntity.class);
		query.setParameter("movieId", movieId);

		List<ShowEntity> showEntities = query.getResultList();

		return ShowEntityConverter.convertShowEntitiesToModels(showEntities);
	}

}
