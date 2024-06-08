package com.project.Expensetracker.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Expensetracker.model.Expense;
import com.project.Expensetracker.model.User;
import com.project.Expensetracker.repo.ExpenseRepo;
import com.project.Expensetracker.repo.UserRepo;
import com.project.Expensetracker.services.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepo expenseRepository;

	@Autowired
	private UserRepo userRepository;

	@Override
	public Expense saveExpense(Expense expense, User user) {
		Optional<User> userId = userRepository.findByUserId(user.getUserId());
		if (userId.isPresent()) {
			expense.setUser(userId.get());
			expense.setExpenseId(expense.getExpenseId());
			return expenseRepository.save(expense);			
		}else {
            throw new RuntimeException("User not found with id: " + user.getUserId());
		}
	}

	@Override
	public Expense getExpenseById(int expenseId) {
		return expenseRepository.findById(expenseId).orElse(null);
	}

	@Override
	public List<Expense> getAllExpense() {
		return expenseRepository.findAll();
	}

	@Override
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public void deleteExpense(int expenseId) {
		expenseRepository.deleteById(expenseId);
	}

}
