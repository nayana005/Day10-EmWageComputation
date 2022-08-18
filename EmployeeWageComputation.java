package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {


	public static final int isPartTime = 0;
	public static final int isFullTime = 1;
	public static final int empRatePerHour = 20;
	public static final int numOfWorkingDay = 20;

	public static void main(String[] args) {
		calMonthlyEmpWage();
	}

	// Method to Calculate Monthly employee wage
	public static void calMonthlyEmpWage() {

		// Variables
		int empHour = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for(int i = 1;i <= numOfWorkingDay;i++) {

			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;

			// Switch case statement
			switch(empCheck) {

			case isFullTime:
				empHour = 8;
				break;

			case isPartTime:
				empHour = 4;
				break;

			default:
				empHour = 0;
			}
			// Calculation
			empWage = empHour * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("\nEmployee Wage " +"Day "+i +" = " +empWage);
		}
		System.out.println("\nTotal Monthly Employee wage = " +totalEmpWage);
	}	
}




	
	




