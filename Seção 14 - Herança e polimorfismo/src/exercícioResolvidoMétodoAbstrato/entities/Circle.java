package exercícioResolvidoMétodoAbstrato.entities;

import exercícioResolvidoMétodoAbstrato.entities.enums.ColorShape;

public class Circle extends Shape {
	
	private static final double  PI = 3.1415;
	
	private double radius;

	public Circle() {
		
	}

	public Circle(ColorShape color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	//area
	public double area() {
		return Math.pow(radius, 2) * PI;
	}
	
	//get and set
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
