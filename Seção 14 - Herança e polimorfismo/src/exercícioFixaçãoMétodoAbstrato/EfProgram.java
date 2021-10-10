package exercícioFixaçãoMétodoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercícioFixaçãoMétodoAbstrato.entities.Company;
import exercícioFixaçãoMétodoAbstrato.entities.Individual;
import exercícioFixaçãoMétodoAbstrato.entities.TaxPayer;

public class EfProgram {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Indivitual or company (i/c)? ");
			char ask = sc.next().charAt(0);
			sc.nextLine();
			if (ask == 'i' || ask == 'I') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));

			} else if (ask == 'c' || ask == 'C') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();

				list.add(new Company(name, anualIncome, numberEmployee));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0.0;
		for (TaxPayer payer : list) {
			System.out.printf("%s: $ %.2f%n", payer.getName(), payer.tax());
			total += payer.tax();
		}

		System.out.printf("TOTAL TAXES: $ %.2f%n",total);

		sc.close();

	}
}
