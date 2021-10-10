package exercícioFixação.application;

import java.util.Locale;
import java.util.Scanner;

import exercícioFixação.model.entities.Account;
import exercícioFixação.model.exception.WithdrawLimitException;
import exercícioFixação.model.exception.WithdrawException;

public class AccountProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, name, withdrawLimit);
			account.deposit(initialBalance);
			
			System.out.print("\nEnter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			
			System.out.printf("New balance: %.2f", account.getBalance());
		}
		catch (WithdrawLimitException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (WithdrawException e) {
			System.out.println("Error in withdraw: " + e.getMessage());
		}
		
	
	sc.close();
	}

}
