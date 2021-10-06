package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/
public class E5 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idPeça1, idPeça2, quantPeça1, quantPeça2;
		double valorPeça1, valorPeça2, valorTotal;
		System.out.print("Insira o ID, quantidade e valor da PEÇA 1: ");
		idPeça1 = sc.nextInt();
		quantPeça1 = sc.nextInt();
		valorPeça1 = sc.nextDouble();
		System.out.print("Insira o ID, quantidade e valor da PEÇA 2: ");
		idPeça2 = sc.nextInt();
		quantPeça2 = sc.nextInt();
		valorPeça2 = sc.nextDouble();
		valorTotal = (quantPeça1 * valorPeça1) + (quantPeça2 * valorPeça2);
		System.out.printf("Valor a pagar: R$ %.2f%n",valorTotal);
		
		sc.close();
	}

}
