package com.bridglabz.employeeWage;

import java.util.Random;



import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        int attendance = random.nextInt(3); // Generate 3 random number 0,1,2

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int wagePerDay = 0;

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

}