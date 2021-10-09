package exercícioResolvidoMétodoAbstrato.entities;

import exercícioResolvidoMétodoAbstrato.entities.enums.ColorShape;

public abstract class Shape {
	
	private ColorShape color;
	
	public Shape() {
		
	}
	
	public Shape (ColorShape color) {
		this.color = color;
	}
	
	//area
	public abstract double area();
	
	public ColorShape getColor() {
		return color;
	}
	public void setColor(ColorShape color) {
		this.color = color;
	}

}
