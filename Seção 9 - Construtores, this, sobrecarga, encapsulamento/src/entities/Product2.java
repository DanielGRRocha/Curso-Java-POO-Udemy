package entities;

public class Product2 {
	
	private String name;
	private double price;
	private int quantity;
	
	//Contrutor Product()
	public Product2() {
		
	}
	//Construtor Product(name: String, quantity: int, price: double)
	public Product2(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	//Construtor Product(name: String, price: double)
	public Product2(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	//TotalValueInStock(): double
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	//AddProducts(quantity: int): void
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	//RemoveProducts(quantity: int): void
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//toString(): String
		public String toString() {
			return name
					+ ", "
					+ quantity
					+ " units, $ "
					+ String.format("%.2f", price)
					+ "/uni | Total: "
					+ String.format("%.2f", TotalValueInStock());
		}
	
	//getters e setters
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Quantity
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//Price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}