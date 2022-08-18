package com.bridgelabz.emp_wage10;

interface ComputeEmpWage{
	
	public void addCompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String companyName);


}
