package com.bridgelabz.emp_wage10;

public class CompanyEmpWage {

    public final String companyName;
    public final  int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHourPerMonth;
    public int totalEmpWage;

   public CompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
       this.companyName = companyName;
       this.empRatePerHour = empRatePerHour;
       this.numOfWorkingDays = numOfWorkingDays;
       this.maxHourPerMonth = maxHourPerMonth;
   }

   public void setTotalEmpWage(int totalEmpWage) {
       this.totalEmpWage = totalEmpWage;
   }

   @Override
   public String toString() {
       return "CompanyEmpWage{" +
               "companyName='" + companyName + '\'' +
               ", empRatePerHour=" + empRatePerHour +
               ", numOfWorkingDays=" + numOfWorkingDays +
               ", maxHourPerMonth=" + maxHourPerMonth +
               ", totalEmpWage=" + totalEmpWage +
               '}';
   }
}
