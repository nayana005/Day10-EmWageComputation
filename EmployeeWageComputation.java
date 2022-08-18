package com.bridgelabz.emp_wage10;

public class EmployeeWageComputation {

	public static final int isPartTime = 1;
	public static final int isfullTime = 2;
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {

		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empRatePerHour,
				numOfWorkingDays, maxHourPerMonth);
		numOfCompany++;
	}

	private void computeEmpWage() {

		for(int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
			System.out.println("==========================================================================\n");
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {

		// Variable
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;

		// Computation
		while(totalEmpHour <= companyEmpWage.maxHourPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {

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
		System.out.println("\n==========================================================================");
		return totalEmpHour * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {

		EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();

		employeeWageComputation.addCompany("Maruti Suzuki", 20,20,100);

		employeeWageComputation.addCompany("Mahindra Tech", 30,15,130);

		employeeWageComputation.addCompany("Toyota", 40,10,70);

		employeeWageComputation.computeEmpWage();

	}
}




	






	
	




