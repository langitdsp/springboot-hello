package com.asterx.medirecords.repository;

import com.asterx.medirecords.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);
}
