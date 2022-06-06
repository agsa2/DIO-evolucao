package model.entities;

import model.exception.WithdrawException;

public class Account {
	
	private Integer number;
	private String  holder;
	private double  balance;
	private double  withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			throw new WithdrawException("the amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new WithdrawException("Not enough balance");
		}
		this.balance -= amount;
	}
	
}
