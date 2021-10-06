package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
*/
public class E5 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idPe�a1, idPe�a2, quantPe�a1, quantPe�a2;
		double valorPe�a1, valorPe�a2, valorTotal;
		System.out.print("Insira o ID, quantidade e valor da PE�A 1: ");
		idPe�a1 = sc.nextInt();
		quantPe�a1 = sc.nextInt();
		valorPe�a1 = sc.nextDouble();
		System.out.print("Insira o ID, quantidade e valor da PE�A 2: ");
		idPe�a2 = sc.nextInt();
		quantPe�a2 = sc.nextInt();
		valorPe�a2 = sc.nextDouble();
		valorTotal = (quantPe�a1 * valorPe�a1) + (quantPe�a2 * valorPe�a2);
		System.out.printf("Valor a pagar: R$ %.2f%n",valorTotal);
		
		sc.close();
	}

}
