package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {

	public static final int isPartTime = 0;
	public static final int isFullTime = 1;
	public static final int empRatePerHour = 20;

	public static void main(String[] args) {
		calEmpWage();
	}

	// Method to Calculate employee wage using switch case
	public static void calEmpWage() {

		// Variables
		int empHour = 0;
		int empWage = 0;
		int empCheck =(int) Math.floor(Math.random() * 10 ) % 3;

		// Switch case statement
		switch(empCheck) {

		case isFullTime:
			System.out.println("Employee is Full-Time !");
			empHour = 8;
			break;

		case isPartTime:
			System.out.println("Employee is Part-Time !");
			empHour = 4;
			break;

		default:
			System.out.println("Employee is Absent !");
			empHour = 0;
		}
		// Calculation
		empWage = empHour * empRatePerHour;
		System.out.println("\nEmployee Wage = " +empWage);
	}
}


	
	




