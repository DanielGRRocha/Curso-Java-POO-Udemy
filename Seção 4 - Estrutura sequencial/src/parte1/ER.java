package parte1;

import java.util.Locale;
import java.util.Scanner;

/* EXERCÍCIO RESOLVIDO 1
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, conforme o exemplo.
Entrada: 10.0 30.0 200.0 Saída: AREA = 300.00 PRECO = 60000.00*/

public class ER {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the terrain width: ");
		double width = sc.nextDouble();
		System.out.print("Enter the terrain length: ");
		double length = sc.nextDouble();
		System.out.print("Enter the square meter value: ");
		double squareMeterValue = sc.nextDouble();
		
		double area = width * length;
		double landPrice = area * squareMeterValue;
		
		System.out.println();
		System.out.printf("AREA = %.2f square meters%nTERRAIN PRICE = %.2f reais%n", area, landPrice);
		
		sc.close();
	}
	

}
