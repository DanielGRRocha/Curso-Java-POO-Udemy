package exercícioFixaçãoPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercícioFixaçãoPolimorfismo.entities.ImportedProduct;
import exercícioFixaçãoPolimorfismo.entities.Product;
import exercícioFixaçãoPolimorfismo.entities.UsedProduct;

public class EfProgram {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		//input
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		
		for(int i = 1; i<=number;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tag = sc.next().charAt(0);
			sc.nextLine();
			
			if(tag == 'c' || tag == 'C') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				Product product = new Product(name, price);
				list.add(product);
			} else if (tag == 'u' || tag == 'U') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product usedProduct = new UsedProduct(name, price, manufactureDate);
				list.add(usedProduct);
			} else if (tag == 'i' || tag == 'I') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				Product importedProduct = new ImportedProduct(name, price, customsFee);
				list.add(importedProduct);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
