package exerc�cioFixa��oM�todoAbstrato.entities;

public abstract class TaxPayer {
	
	private String name;
	private double anualIncome;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();
	
	//getters ans setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	

}
