package exerc�cioFixa��o.entities;

public class Pizza {
	
	private String sabor;
	private double pre�o;
	
	public Pizza() {
		
	}
	
	public Pizza(String sabor, double pre�o) {
		this.sabor = sabor;
		this.pre�o = pre�o;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

}
