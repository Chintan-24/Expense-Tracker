package com.project.Expensetracker.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Expensetracker.model.User;
import com.project.Expensetracker.repo.UserRepo;
import com.project.Expensetracker.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById (int userId) {
		return userRepository.findById(userId).orElse(null);
	}
	
	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public void deleteUser (int userId) {
		 userRepository.deleteById(userId);
	}
}
