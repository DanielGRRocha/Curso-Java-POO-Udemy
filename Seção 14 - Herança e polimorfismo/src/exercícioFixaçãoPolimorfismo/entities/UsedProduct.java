package exercícioFixaçãoPolimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		
		return String.format("%s (used) $ %.2f (Manufacture date: %s)",this.getName(), this.getPrice(), sdf.format(manufactureDate));
	}
	
}
