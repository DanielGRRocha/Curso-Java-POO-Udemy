package exercícioResolvido.entities;

public class Employee {
	
	private String name;
	private Integer hours;
	private double valuePerHour;
	
	public Employee() {
		
	}
	
	public Employee(String name, Integer hours, double valuePerHours) {
		
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHours;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//toString
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%s - %.2f",name,payment()));
		return sb.toString();
	}
	
}
