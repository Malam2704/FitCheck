package com.example.FitCheck.repository;

import com.example.FitCheck.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,String> {
    

}
