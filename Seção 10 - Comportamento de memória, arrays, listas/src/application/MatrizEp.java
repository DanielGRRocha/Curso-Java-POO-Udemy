package application;

import java.util.Scanner;

public class MatrizEp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create matrix
		System.out.print("Enter matrix size [L][C]: ");
		int line = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] matrix = new int[line][column];
		
		//input
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//output
		System.out.println();
		System.out.print("enter a number to track it: ");
		int number = sc.nextInt();
		for(int i = 0;i < matrix.length; i++) {
			for(int j = 0;j < matrix[i].length; j++) {
				if(number == matrix[i][j]) {
					System.out.printf("Position: %d,%d%n",i,j);
					int left = j-1; // >= 0
					int right = j+1;// <= matrix[i].length (column) obs: é < e não <=
					int up = i-1; // >=0
					int down = i+1;// <= matrix.length (line) obs: é < e não <=
					if(left >= 0) {
						System.out.printf("Left: %d%n",matrix[i][left]);
					}
					if(right < matrix[i].length) {
						System.out.printf("Right: %d%n",matrix[i][right]);
					}
					if(up >= 0) {
						System.out.printf("Up:%d%n",matrix[up][j]);
					}
					if(down < matrix.length) {
						System.out.printf("Down: %d%n",matrix[down][j]);
					}
					
					
				}//if1
			
			}//for2
			
		}//for1
		
		
		sc.close();
		
	}//main

}//class
