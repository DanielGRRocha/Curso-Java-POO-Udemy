package entities;

public class BankAccount {
	
	private int number;
	private String holder;
	private double balance;
	
	//BankAccount(number:int, holder:String)
	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	//BankAccount(number: int, holder:String, balance: double)
	public BankAccount(int number,String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//deposit(amount:double):void
	public void deposit(double amount) {
		balance += amount;
	}
	//withdraw(amount:double):void
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	//getters and setters
	//int number
	public int getNumber() {
		return number;
	}
	//String holder
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	//double balance
	public double getBalance() {
		return balance;
	}
	
	//toString():String
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}

}
