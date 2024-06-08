package com.project.Expensetracker.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.Expensetracker.model.Expense;

@Repository
public interface ExpenseRepo extends MongoRepository<Expense, Integer> {
}
