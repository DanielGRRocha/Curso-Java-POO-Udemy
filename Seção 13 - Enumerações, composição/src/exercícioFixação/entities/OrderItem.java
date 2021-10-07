package exerc�cioFixa��o.entities;

public class OrderItem {
	
	private int quantidade;
	private double pre�o;
	private Pizza pizza;
	
	public OrderItem() {
		
	}
	
	public OrderItem(int quantidade, double pre�o, Pizza pizza) {
		this.quantidade = quantidade;
		this.pre�o = pre�o;
		this.pizza = pizza;
		
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public double subTotal() {
		return quantidade * pre�o;
	}
	
	//toString
	public String toString() {
		return String.format("%s , R$ %.2f, Quantidade: %d, Subtotal: R$%.2f", pizza.getSabor(), pre�o, quantidade, subTotal());
	}

}//class
