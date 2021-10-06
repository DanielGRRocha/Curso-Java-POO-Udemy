
package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeEpList;

public class EmployeeEpListProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//create list
		List<EmployeeEpList> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new EmployeeEpList(id, name, salary));
		}
		
		//increase
		System.out.print("Enter the employee id that will have salary increase: ");
		int employee = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		
		for (EmployeeEpList obj : list) {
			if(obj.getId() == employee) {
				obj.increase(obj.getSalary(), percentage);
			}
		}

		//pecorrer com laço for each
		System.out.println();
		System.out.println("List of employees: ");
		for(EmployeeEpList obj : list ) {
			System.out.printf("%d, %s, %.2f%n",obj.getId(),obj.getName(),obj.getSalary());
		}
		
		sc.close();
		
	}//main

}//class
