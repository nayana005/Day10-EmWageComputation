package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {

	public static final int isPartTime = 1;
	public static final int isfullTime = 2;


	public static int computeEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {

		// Variable
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;

		// Computation
		while(totalEmpHour <= maxHourPerMonth && totalWorkingDays <= numOfWorkingDays) {

			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch(empCheck) {

			case isPartTime :
				empHour = 4;
				break;

			case isfullTime :
				empHour = 8;
				break;

			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
			System.out.println("Day- " +totalWorkingDays +"Emp Hour : " +empHour);
		}
		int totalEmpWage = totalEmpHour * empRatePerHour;
		System.out.println("\n==========================================================================");
		System.out.println("Total Employee Wage for Company : " +companyName +" is : " +totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeEmpWage("Maruti Suzuki", 20,20,100);
		System.out.println("==========================================================================");

		computeEmpWage("Mahindra Tech", 30,15,130);
		System.out.println("==========================================================================");

		computeEmpWage("Toyota", 40,10,70);
		System.out.println("==========================================================================");

	}
}


	






	
	




