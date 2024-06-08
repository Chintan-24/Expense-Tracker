package com.project.Expensetracker.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Expenses")
public class Expense {
	
    @Id
    private int expenseId;
    @DBRef
    private User user;
    private String expenseType;
    private float expenseAmount;
    private Date expenseDate;
    private String expenseDescription;
    
	public Expense() {
		super();
	}
	public Expense(int expenseId, User user, String expenseType, float expenseAmount, Date expenseDate,
			String expenseDescription) {
		super();
		this.expenseId = expenseId;
		this.user = user;
		this.expenseType = expenseType;
		this.expenseAmount = expenseAmount;
		this.expenseDate = expenseDate;
		this.expenseDescription = expenseDescription;
	}
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	public float getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(float expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public Date getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getExpenseDescription() {
		return expenseDescription;
	}
	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}
	
	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", user=" + user + ", expenseType=" + expenseType
				+ ", expenseAmount=" + expenseAmount + ", expenseDate=" + expenseDate + ", expenseDescription="
				+ expenseDescription + "]";
	}
    
}
