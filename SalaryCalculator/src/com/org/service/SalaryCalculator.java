package com.org.service;

import com.org.exception.NoBonusException;
import com.org.model.Employee;

public class SalaryCalculator implements Component{
	
	public void calculator() throws NoBonusException {
		Employee emp = new Employee();
		emp.setName("Peter");
		emp.setSalaery(1500);
		emp.setDays(10);
		emp.setBonus(10);
		
		double totalSal = totalSalary(emp);
		System.out.println("The total Salary of " + emp.getName() + " is " + totalSal);
		
		double bonusPercentage = percentage(emp);
		if(bonusPercentage<=0) {
			throw new NoBonusException("Employee is not eligibale for the bomus");
		}
		System.out.println("The bonus percentage of " + emp.getName() + " is " + bonusPercentage + "%");
	}

	@Override
	public double percentage(Employee emp) {
		  
		return (emp.getBonus() * 100)/emp.getSalaery();
	}

	@Override
	public double totalSalary(Employee emp) {
		Employer salary = (double sal, long days) -> sal * days;
		double sumBonus = emp.getSalaery() + emp.getBonus();
		return salary.salaryCalculate(sumBonus, emp.getDays());
	}
	
}
