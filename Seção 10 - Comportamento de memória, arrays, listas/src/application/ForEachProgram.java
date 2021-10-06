//Laço for each
package application;

public class ForEachProgram {
	
	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		//output
		for(int i = 0; i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------");
		
		//for each
		for(String obj: vect) {
			System.out.println(obj);
		}
		
	}//main

}
