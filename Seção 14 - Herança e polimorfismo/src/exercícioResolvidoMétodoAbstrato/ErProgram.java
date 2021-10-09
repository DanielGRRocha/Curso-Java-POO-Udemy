/*
 Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas destas figuras na
mesma ordem em que foram digitadas.
*/

package exercícioResolvidoMétodoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercícioResolvidoMétodoAbstrato.entities.Circle;
import exercícioResolvidoMétodoAbstrato.entities.Rectangle;
import exercícioResolvidoMétodoAbstrato.entities.Shape;
import exercícioResolvidoMétodoAbstrato.entities.enums.ColorShape;

public class ErProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shape: ");
		int number = sc.nextInt();
		
		for(int i = 1; i<=number; i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ask = sc.next().charAt(0);
			
			if(ask == 'R' || ask == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				ColorShape color = ColorShape.valueOf(sc.next());
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
				
			} else if (ask == 'C' || ask == 'c') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				ColorShape color = ColorShape.valueOf(sc.next());
				System.out.print("raius: ");
				double raius = sc.nextDouble();
				
				list.add(new Circle(color, raius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape shape : list) {
			System.out.printf("%.2f%n",shape.area());
		}
		
		sc.close();
	}
}
