package com.bombaySoftware.api.repositories;

import com.bombaySoftware.api.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
