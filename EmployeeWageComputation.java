package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int numOfWorkingDay = 20;
	public static final int maxWorkingHour = 100;

	public static void main(String[] args) {
		computeEmpWage();
	}

	// Method to Calculate Monthly employee wage
	public static int computeEmpWage() {

		// Variables
		int empHour = 0;
		int empWage = 0;
		int totalEmpHour = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;

		while(totalEmpHour <= maxWorkingHour && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
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
			totalEmpHour += empHour;
			System.out.println("Days : " +totalWorkingDays +" Emp Hour :" +empHour);
		}
		totalEmpWage = totalEmpHour * empRatePerHour;
		System.out.println("\nTotal Employee wage = " +totalEmpWage);
		return totalEmpWage;
	}
}

	






	
	




