package com.org.starter;

import com.org.exception.NoBonusException;
import com.org.service.SalaryCalculator;

// Comment lines can be added at the class level and method level 
// that describe the purpose of the class or methods.
public class Main {

	public static void main(String[] args) {

		SalaryCalculator calculator = new SalaryCalculator();
		try {
			calculator.calculator();
		} catch (NoBonusException e) {

			System.out.println("Error caught : " + e.getMessage());
		}

	}

}