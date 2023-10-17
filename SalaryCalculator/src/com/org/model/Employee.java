package com.org.model;

/*
 * This is a pojo class as an example of inheritance and encapsulation
 */
public class Employee extends Bonus{
	
	private String name;
	private double salaery;
	private long days;
	
	public long getDays() {
		return days;
	}
	public void setDays(long days) {
		this.days = days;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaery() {
		return salaery;
	}
	public void setSalaery(double salaery) {
		this.salaery = salaery;
	}
	
	

}
