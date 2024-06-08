package com.project.Expensetracker.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.Expensetracker.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {

	Optional<User> findByUserId(int userId);

}
