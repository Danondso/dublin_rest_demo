package com.dublin.spring.boot.rest.service.techdemo.repository;

import com.dublin.spring.boot.rest.service.techdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

}
