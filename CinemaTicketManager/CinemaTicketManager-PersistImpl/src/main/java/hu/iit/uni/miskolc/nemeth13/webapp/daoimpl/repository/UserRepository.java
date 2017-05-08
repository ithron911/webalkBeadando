package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
