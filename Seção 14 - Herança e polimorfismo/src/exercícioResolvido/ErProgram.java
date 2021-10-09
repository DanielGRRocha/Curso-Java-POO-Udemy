/*
Uma empresa possui funcion�rios pr�prios e terceirizados. Para cada funcion�rio, deseja-se registrar nome, horas trabalhadas e valor por hora. Funcion�rios terceirizado
possuem ainda uma despesa adicional. O pagamento dos funcion�rios corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcion�rios terceirizados
ainda recebem um b�nus correspondente a 110% de sua despesa adicional. Fazer um programa para ler os dados de N funcion�rios (N fornecido pelo usu�rio) e
armazen�-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcion�rio na mesma ordem em que foram digitados.
 */
package exerc�cioResolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerc�cioResolvido.entities.Employee;
import exerc�cioResolvido.entities.OutsourcedEmployee;

public class ErProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced? ");
			char ask = sc.next().charAt(0);
			sc.nextLine();

			if (ask == 'n' || ask == 'N') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();

				Employee employee = new Employee(name, hours, valuePerHour);

				list.add(employee);

			} else if (ask == 'y' || ask == 'Y') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

				list.add(outsourcedEmployee);
			}

		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();

	}

}
