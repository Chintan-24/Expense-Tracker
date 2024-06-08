package com.project.Expensetracker.services;

import java.util.List;

import com.project.Expensetracker.model.Expense;
import com.project.Expensetracker.model.User;

public interface ExpenseService {

//	Expense saveExpense(Expense expense);
	Expense getExpenseById(int expenseId);
	List<Expense> getAllExpense();	
	Expense updateExpense(Expense expense);
	void deleteExpense(int expenseId);
	Expense saveExpense(Expense expense, User user);
}
