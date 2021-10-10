package exercícioFixaçãoMétodoAbstrato.entities;

public class Individual extends TaxPayer {
	
	private double healthExpenditures;

	public Individual() {
		
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		double tax = 0.0;
		if(healthExpenditures > 0) {
			if(this.getAnualIncome() <= 20000) {
				tax = (this.getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
			} else {
				tax = (this.getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
			}
		} else if (healthExpenditures == 0) {
			if(this.getAnualIncome() <= 20000) {
				tax = this.getAnualIncome() * 0.15;
			} else {
				tax = this.getAnualIncome() * 0.25;
			}
		}
		return tax;
	}
	
	//get and set
	public double getHealthExpensive() {
		return healthExpenditures;
	}

	public void setHealthExpensive(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	

}
