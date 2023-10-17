package com.org.service;

import com.org.exception.NoBonusException;
import com.org.model.Employee;

/*
 * This is the service layer where the business logic has been implemented
 * This method is an example of inheritance and polymorphism where it is implementing the Component interface
 *
 */

public class SalaryCalculator implements Component{
	
	/*
	 * This method will calculate the salary of the employee
	 * For simple testing the values are hard coded. With Scanner implementation we can pass the inputs from command line
	 * 
	 */
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

	/*
	 * This is an example of inheritance and polymorphism 
	 * This method will take Employee object as input parameter
	 * This method will return bonus percentage of the employee
	 */
	@Override
	public double percentage(Employee emp) {
		  
		return (emp.getBonus() * 100)/emp.getSalaery();
	}

	/*
	 *This is an example of inheritance and polymorphism 
	 *this method also has the lambda expression implementing the lambda expression
	 * This method will take Employee object as input parameter
	 * This method will return total salary of the employee 
	 */
	@Override
	public double totalSalary(Employee emp) {
		Employer salary = (double sal, long days) -> sal * days;
		double sumBonus = emp.getSalaery() + emp.getBonus();
		return salary.salaryCalculate(sumBonus, emp.getDays());
	}
	
}
