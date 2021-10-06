/*
 Fazer um programa para ler um número interiro N e os dados(nome e preço) de N produtos.
 Armazane os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVector;

public class ClassProductVectorProgram {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter vector length: ");
		int n = sc.nextInt();
		ProductVector[] vect = new ProductVector[n];
		
		//input
		for(int i = 0; i<vect.length; i++) {
			sc.nextLine();
			int aux = i + 1;
			System.out.print("Enter name from product "+aux+":");
			String name = sc.nextLine();
			System.out.print("Enter price from product "+aux+":");
			double price = sc.nextDouble();
			vect[i] = new ProductVector(name, price);	
		}
		
		//avarage
		double sum = 0.0;
		for(int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		
		//output
		System.out.println();
		for(int i = 0;i<vect.length;i++) {
			int aux = i + 1;
			System.out.printf("product %d: %s, R$ %.2f%n",aux,vect[i].getName(),vect[i].getPrice());
		}
		System.out.printf("Avarage: R$ %.2f",avg);
		sc.close();
		
	}

}
