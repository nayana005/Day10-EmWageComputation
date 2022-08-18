package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {

	static final int isFullTime = 1;
	static final int empRatePerHour = 20;

	public static void main(String[] args) {
		dailyEmployeeWage();
	}

	// Method to Calculate daily employee wage
	public static void dailyEmployeeWage() {

		// Variables
		int empHour = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;

		if(empCheck == isFullTime) {
			System.out.println("Employee is present !");
			empHour = 8;
		}
		else {
			System.out.println("Employee is absent !");
			empHour = 0;
		}
		empWage = empHour * empRatePerHour;
		System.out.println("Daily Employee Wage = " +empWage);
	}
}




