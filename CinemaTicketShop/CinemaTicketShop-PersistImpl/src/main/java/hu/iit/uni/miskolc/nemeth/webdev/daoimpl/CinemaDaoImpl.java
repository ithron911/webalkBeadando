package hu.iit.uni.miskolc.nemeth.webdev.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.uni.miskolc.nemeth.webdev.dao.CinemaDao;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter.CinemaEntityConverter;
import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.CinemaEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Cinema;

@Repository
@Transactional
public class CinemaDaoImpl implements CinemaDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Cinema> getAllCinemas() {
		String select = "SELECT c FROm Cinema c";
		TypedQuery<CinemaEntity> query = this.entityManager.createQuery(select, CinemaEntity.class);

		List<CinemaEntity> cinemaEntities = query.getResultList();

		return CinemaEntityConverter.convertCinemaEntitiesToModels(cinemaEntities);
	}

}
