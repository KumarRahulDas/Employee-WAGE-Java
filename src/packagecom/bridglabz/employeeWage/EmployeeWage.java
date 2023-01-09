package com.bridglabz.employeeWage;
//Employee Wage Computation Problems Using OOPS Concept

//Refactor to have list of multiple companies to manage Employee Wage.

import java.util.*;

public class EmployeeWage
{
    public interface IfComputeEmpWage{

        public void addEmployeeWage(String company,int empRatePerHour,int numOfWorkingDays, int maxHourPerMonth);
        public void computeCompanyWage();
    }
    public static class CompWage{
        public String company;
        public int empRatePerHour;
        public int numWorkingDays;
        public int maxHourPerMonth;
        public int totalWage;

        public CompWage(String company,int empRatePerHour,int numWorkingDays, int maxHourPerMonth)
        {
            this.company=company;
            this.empRatePerHour=empRatePerHour;
            this.numWorkingDays=numWorkingDays;
            this.maxHourPerMonth=maxHourPerMonth;
        }
        public void setTotalWage(int totalwage)
        {
            this.totalWage=totalwage;
        }
        public String toString()
        {
            return "Total emp wage for company: "+company+" is "+totalWage;
        }
    }

    public static class EmpBuilder implements IfComputeEmpWage
    {
        static final int IS_FULL_TIME=2;
        static final int IS_PART_TIME=1;
        public ArrayList<CompWage> compempwagelist;
        private int n=0;

        public EmpBuilder()
        {
            compempwagelist= new ArrayList();

        }
        public void addEmployeeWage(String company,int empRatePerHour,int numWorkingDays, int maxHourPerMonth)
        {
            CompWage c =new CompWage(company,empRatePerHour,numWorkingDays,maxHourPerMonth);
            compempwagelist.add(c);
        }
        public void computeCompanyWage()
        {
            for(int i=0;i<compempwagelist.size();i++)
            {
                CompWage c1=compempwagelist.get(i);
                c1.setTotalWage(this.ComputeWage(c1));
                System.out.println(c1.totalWage);
            }
        }
        public int ComputeWage(CompWage c)
        {
            int employeehrs=0;
            int totalworkdays=0;
            int totalemphrs=0;
            //int totalWage=0;

            while(totalemphrs<=c.maxHourPerMonth&&totalworkdays<c.numWorkingDays)
            {
                totalworkdays++;
                int empcheck=(int) Math.floor(Math.random()*10)%3;

                switch(empcheck)
                {
                    case 1:
                        employeehrs=4;
                        break;
                    case 2:
                        employeehrs=8;
                        break;
                    default:
                        employeehrs=0;
                }
                totalemphrs+=employeehrs;
                System.out.println("Emp hrs for day "+totalworkdays+" is: "+employeehrs);
                System.out.println("Daily wage for employee is: "+ employeehrs*c.empRatePerHour);
            }
            return totalemphrs* c.empRatePerHour;
        }
    }
    public static void main(String[] args) {
        IfComputeEmpWage e= new EmpBuilder();
        e.addEmployeeWage("D-Mart",20,20,100);
        e.addEmployeeWage("Amazon",10,10,100);
        e.computeCompanyWage();



//Refactor to have list of multiple companies to manage Employee Wage.

import java.util.ArrayList;

public class EmployeeWage
{
    public interface IfComputeEmpWage{

        public void addEmployeeWage(String company,int empRatePerHour,int numOfWorkingDays, int maxHourPerMonth);
        public void computeCompanyWage();
    }
    public static class CompWage{
        public String company;
        public int empRatePerHour;
        public int numWorkingDays;
        public int maxHourPerMonth;
        public int totalWage;

        public CompWage(String company,int empRatePerHour,int numWorkingDays, int maxHourPerMonth)
        {
            this.company=company;
            this.empRatePerHour=empRatePerHour;
            this.numWorkingDays=numWorkingDays;
            this.maxHourPerMonth=maxHourPerMonth;
        }
        public void setTotalWage(int totalwage)
        {
            this.totalWage=totalwage;
        }
        public String toString()
        {
            return "Total emp wage for company: "+company+" is "+totalWage;
        }
    }

    public static class EmpBuilder implements IfComputeEmpWage
    {
        static final int IS_FULL_TIME=2;
        static final int IS_PART_TIME=1;
        public ArrayList<CompWage> compempwagelist;
        private int n=0;

        public EmpBuilder()
        {
            compempwagelist= new ArrayList();

        }
        public void addEmployeeWage(String company,int empRatePerHour,int numWorkingDays, int maxHourPerMonth)
        {
            CompWage c =new CompWage(company,empRatePerHour,numWorkingDays,maxHourPerMonth);
            compempwagelist.add(c);
        }
        public void computeCompanyWage()
        {
            for(int i=0;i<compempwagelist.size();i++)
            {
                CompWage c1=compempwagelist.get(i);
                c1.setTotalWage(this.ComputeWage(c1));
                System.out.println(c1.totalWage);
            }
        }
        public int ComputeWage(CompWage c)
        {
            int employeehrs=0;
            int totalworkdays=0;
            int totalemphrs=0;
            //int totalwage=0;

            while(totalemphrs<=c.maxHourPerMonth&&totalworkdays<c.numWorkingDays)
            {
                totalworkdays++;
                int empcheck=(int) Math.floor(Math.random()*10)%3;

                switch(empcheck)
                {
                    case 1:
                        employeehrs=4;
                        break;
                    case 2:
                        employeehrs=8;
                        break;
                    default:
                        employeehrs=0;
                }
                totalemphrs+=employeehrs;
                System.out.println("Emp hrs for day "+totalworkdays+" is: "+employeehrs);
            }
            return totalemphrs* c.empRatePerHour;
        }
    }
    public static void main(String[] args) {
        IfComputeEmpWage e= new EmpBuilder();
        e.addEmployeeWage("D-Mart",20,20,100);
        e.addEmployeeWage("Amazon",10,10,100);
        e.computeCompanyWage();



//Ability To Manage EmpWage O fMultiple Companies
public class EmployeeWage {
    //instance Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public class CompanyEmpWage
    {
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
        {
            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
        }



//Ability To Save Total Wage For Each Company
//Employee Wage Computation Problems Using OOPS Concept
//Ability To Save Total Wage For Each Company
public class EmployeeWage
{
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    final String companyName;
    final int empRatePerHour;
    final int numOfWorkingDays;
    final int maxHoursPerMonth;
    int totalEmpWage;

    public EmployeeWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage()
    {
        //variables
        int empHrs = 0,totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;



    }

    public String toString() {
        return "Total Emp Wage for Company: " + companyName +" is: " + totalEmpWage;
    }
    public static void main(String[] args) {

        EmployeeWage dMart = new EmployeeWage("D-Mart", 20, 20, 100);
        EmployeeWage reliance = new EmployeeWage("Amazon", 10, 10, 100);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);

//Use Class Method and Class Variables

//Employee Wage Computation Problems Using OOPS Concept
//Use Class Method and Class Variables


public class EmployeeWage
{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;


    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;


    static void ComputeEmployeeWage()
    {
        //Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
    public static void main(String args[])
    {
        ComputeEmployeeWage();
    }

//Employee Wage Computation Problems


    public static int computeEmpWage(String companyName, int empRatePerHour ,int  numOfWorkingDays , int maxHoursPerMonth)
    {
        //Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;


        //Computation
        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for company: " + companyName+" is:" + totalEmpWage);
        return totalEmpWage;






import java.util.Random;
public class EmployeeWage
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;
    static final int WORKING_DAY =20;
    static final int TOTAL_WORKING_HOURS = 100;

    public static void main(String[] args)
    {
        int empWage = 0;
        int totalwage = 0;
        int totalworkinghours = 0;
        int totalworkingdays = 0;

        while (totalworkingdays < WORKING_DAY && totalworkinghours < TOTAL_WORKING_HOURS )
        {
            Random random = new Random();
            int empPresent = random.nextInt(3);
            System.out.println("Random Value for Employee Attendance is :" + empPresent);


            int x;
            switch (empPresent)
            {
                case EMP_FULL_TIME:
                    x = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empWage = empWage + x;
                    totalworkinghours = totalworkinghours + FULL_TIME_HOUR;
                    System.out.println("Employee is present and the wage is : " + empWage);
                    totalworkingdays++;
                    break;

                case EMP_PART_TIME:
                    x = WAGE_PER_HOUR * PART_TIME_HOUR;
                    empWage = empWage + x;
                    totalworkinghours = totalworkinghours + PART_TIME_HOUR;
                    System.out.println("Employee is Part time present and the wage is : " + empWage);
                    totalworkingdays++;
                    break;


        Random random = new Random();



        int attendance = random.nextInt(3); // Generate 3 random number 0,1,2


        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int wagePerDay = 0;

        int monthlySalary = 0;

        for (int day = 1; day <= 20; day++) {

            int attendance = random.nextInt(3); // Generate 3 random number 0,1,2
            System.out.println("randomNumber"+attendance);
            wagePerDay =0;
            switch (attendance) {

                case 0:
                    System.out.println("Employee Absent");
                    break;

                case 1:
                    System.out.println("Employee Part Time Present");
                    wagePerDay = partTimeHour * wagePerHour;
                    break;
                default:
                    System.out.println("Employee Full Day Present..");
                    wagePerDay = wagePerHour * fullDayHour;
                    break;
            }

            monthlySalary = monthlySalary + wagePerDay;
            System.out.println(day + " : " + monthlySalary);
        }


        switch (attendance) {

            case 0:
                System.out.println("Employee Absent");
                break;

            case 1:
                System.out.println("Employee Part Time Present");
                wagePerDay = wagePerHour * partTimeHour;
            default:
                System.out.println("Employee Full Day Present..");
                wagePerDay = wagePerHour * fullDayHour;
        }

        System.out.println("Employee Wage Per Day :-" + wagePerDay);


        int attendance = random.nextInt(3);

        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;
        int wagePerDay = 0;

        switch (attendance) {
            case 0:
                System.out.println("Employee Absent.");
                break;
            case 1:
                wagePerDay = partTimeHours * wagePerHour;
                break;
            default:
                wagePerDay = fullDayHours * wagePerHour;

        }

        System.out.println("Employee Wage Per Day: " + wagePerDay);


        int attendance = random.nextInt(2);

        int wagePerHour = 20;
        int fullDayHours = 8;
        int wagePerDay = 0;

        if (attendance == 1) {
            System.out.println("Employee Present..");
            wagePerDay = wagePerHour * fullDayHours;
        } else
            System.out.println("Employee Absent");

        System.out.println("Employee Wage Per Day: " + wagePerDay);





    }
    private int numOfCompany =0;
    private CompanyEmpWage[] companyEmpWageArray;


    public EmployeeWage()
    {
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    private void computeEmpWage()
    {
        for (int i = 0; i < numOfCompany; i++)
        {
            int totalEmpWage = calculateEmpHrs(companyEmpWageArray[i]);
            System.out.println("Total Emp Wage for Company " + companyEmpWageArray[i].company + " is : " + totalEmpWage);
        }
    }
    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }
    private int calculateEmpHrs(CompanyEmpWage companyEmpWage)
    {
        //Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }
    public static void main(String args[])
    {
        EmployeeWage employeeWageBuilder = new EmployeeWage();
        employeeWageBuilder.addCompanyEmpWage("D-Mart", 20, 20, 100);
        employeeWageBuilder.addCompanyEmpWage("Amazon", 10, 10, 100);
        employeeWageBuilder.computeEmpWage();


                default:
                    System.out.println("Employee is absent and the wage is : " + empWage);
                    break;

            }

        }
        System.out.println("Total Working Days :" +totalworkingdays);
        System.out.println("Total Working Hours :" +totalworkinghours);
        System.out.println("Total wage of employee for the month is : " + empWage);

    }
    public static void main(String args[])
    {
        computeEmpWage("D-Mart",20,20,100);
        computeEmpWage("Amazon",10,10,100);




    }
}