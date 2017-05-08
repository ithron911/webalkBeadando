package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository;

import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.ShowEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends CrudRepository<ShowEntity, Integer>{

}
