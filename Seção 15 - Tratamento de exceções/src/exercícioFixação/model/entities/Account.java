package exercícioFixação.model.entities;

import exercícioFixação.model.exception.WithdrawLimitException;
import exercícioFixação.model.exception.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(Integer number, String holder, double withdrawLimit) throws WithdrawLimitException {
		
		if(withdrawLimit < 0) {
			throw new WithdrawLimitException("Withdraw limit cannot be negative");
		}
		
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
	}
	
	//getters and setters
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

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//metodos
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		if(amount > withdrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new WithdrawException("Not enough balance");
		}
			
		balance -= amount;
	}
	

}
