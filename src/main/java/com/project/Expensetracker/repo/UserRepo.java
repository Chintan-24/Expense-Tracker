package com.project.Expensetracker.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Expensetracker.model.User;

public interface UserRepo extends MongoRepository<User, Integer> {

}
