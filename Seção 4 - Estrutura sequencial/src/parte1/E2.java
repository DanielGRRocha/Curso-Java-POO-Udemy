package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
casas decimais conforme exemplos.
F�rmula da �rea: area = pi . raio2
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
