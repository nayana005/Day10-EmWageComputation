package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {

	public static final int isPartTime = 1;
	public static final int isfullTime = 2;

	private final String companyName;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHourPerMonth;
	private int totalEmpWage;

	public EmployeeWageComputation(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHourPerMonth = maxHourPerMonth;
	}

	public void computeEmpWage() {

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
		totalEmpWage = totalEmpHour * empRatePerHour;
	}

	@Override
	public String toString() {
		return "EmployeeWageBuilder{" +
				"companyName='" + companyName + '\'' +
				", empRatePerHour=" + empRatePerHour +
				", numOfWorkingDays=" + numOfWorkingDays +
				", maxHourPerMonth=" + maxHourPerMonth +
				", totalEmpWage=" + totalEmpWage +
				'}';
	}

	public static void main(String[] args) {

		EmployeeWageComputation marutiSuzuki = new EmployeeWageComputation("Maruti Suzuki",
				20,20,100);

		EmployeeWageComputation mahindraTech = new EmployeeWageComputation("Mahindra Tech",
				30,15,130);

		EmployeeWageComputation toyota = new EmployeeWageComputation("Toyota",
				40,10,70);

		marutiSuzuki.computeEmpWage();
		System.out.println(marutiSuzuki);
		System.out.println("========================================================================================");

		mahindraTech.computeEmpWage();
		System.out.println(mahindraTech);
		System.out.println("========================================================================================");

		toyota.computeEmpWage();
		System.out.println(toyota);
		System.out.println("========================================================================================");
	}
}



	






	
	




