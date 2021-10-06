package parte1;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B
*/
public class E6 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, areaTriangulo, areaCirculo, areaTrapezio,areaQuadrado, areaRetangulo;
		
		System.out.print("Insira valor de A, B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		areaTriangulo = (A * C)/2; //base(A) * altura(C)
		areaCirculo = 3.14159 * Math.pow(C, 2) ;//pi . raio(C)^2
		areaTrapezio = ((A+B)/2) * C ;//(baseMaior(A)+baseMenor(B)/2)*h(C)
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;
		
		System.out.printf("Área triângulo: %.3f%n",areaTriangulo);
		System.out.printf("Área círculo: %.3f%n",areaCirculo);
		System.out.printf("Área trapézio: %.3f%n",areaTrapezio);
		System.out.printf("Área quadrado: %.3f%n",areaQuadrado);
		System.out.printf("Área retângulo: %.3f%n",areaRetangulo);
		
		sc.close();
		
	}

}

