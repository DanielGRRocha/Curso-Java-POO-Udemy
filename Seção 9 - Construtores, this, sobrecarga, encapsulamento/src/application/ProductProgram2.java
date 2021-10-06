package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class ProductProgram2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product2 prod;
		
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		
		prod = new Product2(name,quantity,price);
		
		System.out.printf("%nName: %s%nQuantity: %d%nPrice: %.2f%n",prod.getName(),prod.getQuantity(),prod.getPrice());
		
		prod.setName("Patinete");
		prod.setQuantity(4);
		prod.setPrice(800.00);
		
		System.out.printf("%nName: %s%nQuantity: %d%nPrice: %.2f%n%n",prod.getName(),prod.getQuantity(),prod.getPrice());
		
		System.out.println("Product data: " + prod.toString());	
		
		System.out.print("Add in stock: ");
		prod.AddProducts(sc.nextInt());
		System.out.println("Product data: " + prod.toString());
	
		System.out.print("Remove from stock: ");
		prod.RemoveProducts(sc.nextInt());
		System.out.println("Product data: " + prod.toString());

		sc.close();
		
		
	}

}