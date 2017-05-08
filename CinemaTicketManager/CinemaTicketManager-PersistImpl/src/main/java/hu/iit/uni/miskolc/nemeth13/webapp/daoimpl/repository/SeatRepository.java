package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.SeatEntity;

@Repository
public interface SeatRepository extends CrudRepository<SeatEntity, Integer> {

}
