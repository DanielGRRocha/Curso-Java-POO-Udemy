package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
decimais.
 */
public class E4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeId;
		double hoursWorked, hourPrice, wage;
		
		System.out.print("Enter employee id: ");
		employeeId = sc.nextInt();
		System.out.print("Enter amount of hours worked: ");
		hoursWorked = sc.nextDouble();
		System.out.print("Enter the hourly price: ");
		hourPrice = sc.nextDouble();
		
		wage = hoursWorked * hourPrice;
		
		System.out.println();
		System.out.printf("Employee id: %d%nWage: U$ %.2f%n",employeeId,wage);
		
		sc.close();
		
		
		
	}
}

