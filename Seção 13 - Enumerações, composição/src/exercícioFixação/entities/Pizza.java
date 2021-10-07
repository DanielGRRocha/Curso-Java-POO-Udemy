package exercícioFixação.entities;

public class Pizza {
	
	private String sabor;
	private double preço;
	
	public Pizza() {
		
	}
	
	public Pizza(String sabor, double preço) {
		this.sabor = sabor;
		this.preço = preço;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}

}
