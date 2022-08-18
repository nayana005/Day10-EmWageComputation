package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {


	static final int isPartTime = 0;
	static final int isFullTime = 1;
	static final int empRatePerHour = 20;

	public static void main(String[] args) {
		calculateEmployeeWage();
	}

	// Method to Calculate daily employee wage and added part-time employee
	public static void calculateEmployeeWage() {

		// Variables
		int empHour = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 3;

		if(empCheck == isFullTime) {
			System.out.println("Employee is Full-Time !");
			empHour = 8;
		}
		else if(empCheck == isPartTime) {
			System.out.println("Employee is Part-Time !");
			empHour = 4;
		}
		else {
			System.out.println("Employee is Absent !");
			empHour = 0;
		}

		empWage = empHour * empRatePerHour;
		System.out.println("\nEmployee Wage = " +empWage);
	}
}

	




