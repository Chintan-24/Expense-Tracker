package com.project.Expensetracker.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.Expensetracker.model.User;
import com.project.Expensetracker.services.UserService;

@RestController
@RequestMapping("/ET/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping
	public List<User>getAllUsers(){
		return userService.getAllUsers();
	}
}
