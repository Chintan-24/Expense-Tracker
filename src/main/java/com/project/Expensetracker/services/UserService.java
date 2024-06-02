package com.project.Expensetracker.services;

import java.util.List;

import com.project.Expensetracker.model.User;

public interface UserService {

	User createUser(User user);
	User getUserById (int userId);
	List<User> getAllUsers();
	User updateUser(User user);
	void deleteUser (int userId);
	
	
}
