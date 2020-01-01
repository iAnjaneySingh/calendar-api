package com.cldr.repository;

import org.springframework.data.repository.CrudRepository;
import com.cldr.user.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
//crud repository : Creating for mysql, Spring boot has a functionality of Autowiring i.e, to send all the the methods to the database.