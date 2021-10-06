package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class BankAccountProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();//clean buffer
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit?(y/n): ");
		char response = sc.next().charAt(0);
		if(response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
		} else {
			account = new BankAccount(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println();
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println();
		System.out.println("Update account data:");
		System.out.println(account);
		
		
		sc.close();
	}

}
