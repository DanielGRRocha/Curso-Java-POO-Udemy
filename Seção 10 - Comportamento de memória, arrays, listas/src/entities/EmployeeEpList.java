package entities;

public class EmployeeEpList {
	
	private int id;
	private String name;
	private double salary;
	
	//constructor
	public EmployeeEpList(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//increase(salary:double, percent: double):void
	public void increase(double salary, double percentage) {
		this.salary += salary * percentage/100;
		
	}
	
	//getters and setters
	//id
	public int getId() {
		return id;
	}
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
