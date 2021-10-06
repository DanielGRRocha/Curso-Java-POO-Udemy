package application;

import java.util.Locale;
import java.util.Scanner;

public class HeightVectorProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N value: ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		//input
		for(int i = 0; i<n; i++) {
			int aux = i+1;
			System.out.println("Enter hieght "+aux+": ");
			vect[i] = sc.nextDouble();
		}
		
		//media
		double sum = 0;
		for(int i =0;i<n;i++) {
			sum += vect[i];
		}
		double avg = sum/n;
		
		//output
		for(int i = 0; i<n; i++) {
			int aux = i+1;
			System.out.printf("Hieght %d: %.2f%n",aux,vect[i]);
		}
		System.out.printf("Average height: %.2f",avg);
		
		sc.close();
	}

}
