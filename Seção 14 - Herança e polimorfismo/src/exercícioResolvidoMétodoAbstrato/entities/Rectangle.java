package exercícioResolvidoMétodoAbstrato.entities;

import exercícioResolvidoMétodoAbstrato.entities.enums.ColorShape;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle () {
		
	}

	public Rectangle(ColorShape color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	//area
	public double area() {
		return width * height;
	}
	
	//getters and setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
