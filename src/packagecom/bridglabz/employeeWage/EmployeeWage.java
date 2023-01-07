package com.bridglabz.employeeWage;
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

import java.util.Random;




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


                default:
                    System.out.println("Employee is absent and the wage is : " + empWage);
                    break;

            }

        }
        System.out.println("Total Working Days :" +totalworkingdays);
        System.out.println("Total Working Hours :" +totalworkinghours);
        System.out.println("Total wage of employee for the month is : " + empWage);
    }

}