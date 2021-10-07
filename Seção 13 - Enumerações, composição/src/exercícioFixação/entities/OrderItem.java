package exercícioFixação.entities;

public class OrderItem {
	
	private int quantidade;
	private double preço;
	private Pizza pizza;
	
	public OrderItem() {
		
	}
	
	public OrderItem(int quantidade, double preço, Pizza pizza) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.pizza = pizza;
		
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public double subTotal() {
		return quantidade * preço;
	}
	
	//toString
	public String toString() {
		return String.format("%s , R$ %.2f, Quantidade: %d, Subtotal: R$%.2f", pizza.getSabor(), preço, quantidade, subTotal());
	}

}//class
