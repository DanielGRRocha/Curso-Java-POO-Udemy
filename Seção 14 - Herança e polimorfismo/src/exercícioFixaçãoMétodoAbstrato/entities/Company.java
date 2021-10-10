package exercícioFixaçãoMétodoAbstrato.entities;

public class Company extends TaxPayer {
	
private int numberEmployees;
	
	public Company() {
		
	}

	public Company(String name, double anualIncome, int numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double tax() {
		double tax;
		if(numberEmployees <= 10) {
			tax = this.getAnualIncome() * 0.16;
		} else {
			tax = this.getAnualIncome() * 0.14;
		}
		return tax;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	

}
