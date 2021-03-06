package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	//composi??o de objetos
	private Department department;
	private List<HourContract> listContracts = new ArrayList<>(); //composi??o tem-muitos(lista) - n?o inclui no construtor
	
	//Constructor
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {//sem a lista, instancia na declara??o do atributo
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	//m?todos
	
	public void addContract(HourContract contract) {
		listContracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		listContracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : listContracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}//for
		return sum;
		
	}//income
	
	//getters and setters
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//level
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	//baseSalary
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	//department
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	//contracts
	public List<HourContract> getContracts() {
		return listContracts;
	}
	
	
	
	
	

}//class
