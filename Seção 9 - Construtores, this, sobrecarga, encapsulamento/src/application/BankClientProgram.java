/*
 Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular e valor de depósito inicial que o titular depositou ao abrir a conta.
 Este valor, entretanto, é opcional.
 Uma vez que uma conta bancária for aberta, o número da conta nunca poderá ser alterado, já o nome do titular poderá.
 Por fim, o saldo da conta não pode ser alterado livremente, o saldo só aumenta por meio de depósito e só diminui por saques.
 Para cada saque realizado o banco cobrará uma taxa de $5.00.
 Você deverá fazer um programa que realize o cadastro de uma conta. Em seguida, realizar um depósito e um saque, sempre mostrando os dados da conta após cada operação.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankClient;

public class BankClientProgram {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		sc.nextLine();//clean buffer
		String name = sc.nextLine();
		
		BankClient bc = new BankClient(id,name);
		
		System.out.print("Is there an initial deposit? ");
		char thereIs;
		thereIs = sc.next().charAt(0);
		if(thereIs == 'y' || thereIs == 'Y') {
			System.out.print("Enter initial deposit value: ");
			bc.addMoney(sc.nextDouble());
		}
		
		System.out.println();
		System.out.print(bc);
		
		System.out.print("Enter the value to add in balance: ");
		bc.addMoney(sc.nextDouble());
		
		System.out.println();
		System.out.print(bc);
		
		System.out.print("Enter the value to withdraw from balance: ");
		bc.withdrawMoney(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Account id: %d, Name: %s | Balance: %.2f",bc.getAccountId(),bc.getName(),bc.getBalance());
		
		sc.close();
	}

}
