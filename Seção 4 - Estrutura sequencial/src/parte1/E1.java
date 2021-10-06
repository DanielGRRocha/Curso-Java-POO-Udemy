package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.
*/

public class E1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int valueA, valueB, sum;
		
		System.out.print("Enter value A: ");
		valueA = sc.nextInt();
		System.out.print("Enter value B: ");
		valueB = sc.nextInt();
		sum = valueA + valueB;
		
		System.out.printf("Sum value: %d",sum);
		
		sc.close();
		
		
	}

}
