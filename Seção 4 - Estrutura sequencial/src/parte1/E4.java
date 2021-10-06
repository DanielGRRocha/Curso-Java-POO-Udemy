package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
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

