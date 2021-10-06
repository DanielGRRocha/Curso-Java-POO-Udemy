/*
 Fazer um programa para ler um n�mero interiro N e os dados(nome e pre�o) de N produtos.
 Armazane os N produtos em um vetor. Em seguida, mostrar o pre�o m�dio dos produtos.
 */
package entities;

public class ProductVector {
	
	private String name;
	private double price;
	
	//ProductVector(name:String,price:double)
	public ProductVector(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//getters and setters
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
