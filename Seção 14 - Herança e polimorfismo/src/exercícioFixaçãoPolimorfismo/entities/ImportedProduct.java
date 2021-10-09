package exercícioFixaçãoPolimorfismo.entities;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return this.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		
		return String.format("%s $ %.2f (Customs fee: $ %.2f)",this.getName(), totalPrice(), customsFee);
	}

}
