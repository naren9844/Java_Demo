package com.org.service;

/*
 * This is a functional interface where the lambda expression will used to implement its method in SalaryCalculator class
 */
@FunctionalInterface
public interface Employer {

	double salaryCalculate(double amount, long days);
}
