package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository;

import org.springframework.data.repository.CrudRepository;

import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
