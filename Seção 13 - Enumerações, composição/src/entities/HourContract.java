package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private double valuePerHour;
	private Integer hours;
	
	//Constructor
	public HourContract() {
		
	}
	
	public HourContract(Date date, double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	//método
	
	public double totalValue() {
		
		return valuePerHour * hours; 
	}
	
	//getters and setters
	//date
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//valuePerHour
	public double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	//hours
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	


}//class
