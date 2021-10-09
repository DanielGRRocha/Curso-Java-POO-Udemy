package exercícioResolvido.entities;

public class OutsourcedEmployee extends Employee {
	
	private double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Integer hours, double valuePerHours, double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}


	@Override
	public double payment() {
		double bonus = additionalCharge * 1.1;
		return this.getHours() * this.getValuePerHour() + bonus;
	}
	
	
}
