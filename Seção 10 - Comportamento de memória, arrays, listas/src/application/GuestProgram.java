package application;

import java.util.Scanner;

import entities.Guest;

public class GuestProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create vector
		System.out.print("How many rroms will be rented? ");
		int n = sc.nextInt();
		Guest[] vect = new Guest[10];
		
		//input
		for(int i = 0; i < n; i++) {
			sc.nextLine();//clean buffer
			int aux = 1 + i;
			System.out.println("Rent #"+aux);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[i] = new Guest(name, email, room);
		}
		//output
		System.out.println("Busy rooms: ");
		for(int i = 0; i<n; i++) {
			if(vect[i] != null) {
				System.out.printf("%d: %s, %s%n",vect[i].getRoom(),vect[i].getName(),vect[i].getEmail());
			}
		}
		
		sc.close();
		
	}//main

}//class
