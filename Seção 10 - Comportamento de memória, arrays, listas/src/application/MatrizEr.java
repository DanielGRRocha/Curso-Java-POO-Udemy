/*
 Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
 Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */
package application;

import java.util.Scanner;

public class MatrizEr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create matrix
		System.out.print("matrix order: ");
		int n = sc.nextInt();
		
		Integer[][] matrix = new Integer[n][n];
		
		//input
		for(int i = 0; i < matrix.length; i++) {//matrix.length quantidade de linhas
			for(int u = 0; u < matrix[i].length; u++) {//matrix[i].length quantidade de colunas
				matrix[i][u] = sc.nextInt();
			}
		}
		
		//output
		//diagonal
		System.out.println("Main diagonal: ");
		for(int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		//negative numbers
		System.out.println();
		int cont = 0;
		for(int i = 0; i<matrix.length;i++) {
			for(int u = 0; u < matrix[i].length; u++) {
				if(matrix[i][u] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Negative numbers = "+cont);
		
		sc.close();
	}//main

}//class
