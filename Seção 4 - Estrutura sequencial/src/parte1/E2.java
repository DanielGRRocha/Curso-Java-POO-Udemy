package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = pi . raio2
Considere o valor de pi = 3.14159
*/

public class E2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ray, area;
		
		System.out.print("Enter ray value: ");
		ray = sc.nextDouble();
		
		area = 3.14159 * Math.pow(ray,2);
		
		System.out.printf("Circle area = %.4f%n",area);
		
		sc.close();
	}

}
