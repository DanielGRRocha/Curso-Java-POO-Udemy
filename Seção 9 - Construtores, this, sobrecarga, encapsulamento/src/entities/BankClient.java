/*
 Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do titular e valor de dep�sito inicial que o titular depositou ao abrir a conta.
 Este valor, entretanto, � opcional.
 Uma vez que uma conta banc�ria for aberta, o n�mero da conta nunca poder� ser alterado, j� o nome do titular poder�.
 Por fim, o saldo da conta n�o pode ser alterado livremente, o saldo s� aumenta por meio de dep�sito e s� diminui por saques.
 Para cada saque realizado o banco cobrar� uma taxa de $5.00.
 Voc� dever� fazer um programa que realize o cadastro de uma conta. Em seguida, realizar um dep�sito e um saque, sempre mostrando os dados da conta ap�s cada opera��o.
 */
package entities;

public class BankClient {
	
	private int accountId;
	private String name;
	private double balance;
	public static final double TAX = 5.00;
	
	//BankClient(accountId: int,name:String)
	public BankClient(int accountId,String name) {
		this.accountId = accountId;
		this.name = name;
	}
	
	//addMoney(money:double):void
	public void addMoney(double money) {
		this.balance += money; 
	}
	
	//withdrawMoney(money:double):void
	public void withdrawMoney(double money) {
		double withdraw = (money+TAX);
		if(balance >= withdraw) {
			this.balance -= withdraw;
		} else {
			System.out.println("Ops, no balance to withdraw.");
		}
	}
	
	//toString():String
	public String toString() {
		return String.format("Account id: %d, ", accountId)
				+ String.format("Name: %s | ", name)
				+ String.format("Balance: %.2f%n", balance);
	}
	
	//getters and setters
	//accountId
	public int getAccountId() {
		return accountId;
	}
	
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//balance
	public double getBalance() {
		return balance;
	}

}
