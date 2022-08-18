package com.bridgelabz.emp_wage10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWageComputation implements ComputeEmpWage {

    public static final int isPartTime = 1;
    public static final int isfullTime = 2;
    private int numOfCompany = 0;

    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

    public EmployeeWageComputation() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName,empRatePerHour,numOfWorkingDays,maxHourPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(companyName,companyEmpWage);
    }

    public void computeEmpWage() {

        for(int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
            System.out.println("==========================================================================\n");
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

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

    public int getTotalWage(String companyName) {
        return companyToEmpWageMap.get(companyName).totalEmpWage;
    }

    public static void main(String[] args) {

    	ComputeEmpWage empWageComputation = new EmployeeWageComputation();

        empWageComputation.addCompanyEmpWage("Maruti Suzuki", 20,20,100);

        empWageComputation.addCompanyEmpWage("Mahindra Tech", 30,15,130);

        empWageComputation.addCompanyEmpWage("Toyota", 40,10,70);

        empWageComputation.computeEmpWage();

        System.out.println("Total Wage for Maruti Suzuki : " +empWageComputation.getTotalWage("Maruti Suzuki"));
        System.out.println("Total Wage for Mahindra Tech : " +empWageComputation.getTotalWage("Mahindra Tech"));
        System.out.println("Total Wage for Toyota : " +empWageComputation.getTotalWage("Toyota"));
    }
}

	



	






	
	




