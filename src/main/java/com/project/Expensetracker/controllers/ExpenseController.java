package com.project.Expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Expensetracker.model.Expense;
import com.project.Expensetracker.model.User;
import com.project.Expensetracker.services.ExpenseService;
import com.project.Expensetracker.services.UserService;

@RestController
@RequestMapping("/ET/expense")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	
	@PostMapping
	public Expense saveExpense(@RequestBody Expense expense, User user) {
		return expenseService.saveExpense(expense, user);
	}
	
	@GetMapping
	public List<Expense>getAllExpense(){
		return expenseService.getAllExpense();
	}
}
