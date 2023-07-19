package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");

        //UC1:Check Employee is Present or Absent
        //UC3:Part-Time Employee and Wage
        Random random = new Random();
        int attendance = random.nextInt(3);
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else if (attendance == 0) {
            System.out.println("Employee is Absent");
        } else
            System.out.println("Employee is Part-Time");

        //UC2:Daily Employee Wage
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int dailyWage = attendance * fullDayHour * wagePerHour;
        int partTimeWage = partTimeHour * wagePerHour;

        if (attendance == 1) {
            System.out.println("Employee Daily Wage : "+dailyWage);
        } else if (attendance == 0) {
            System.out.println("Employee Daily Wage : "+dailyWage);
        } else
            System.out.println("Employee Part-Time Wage : "+partTimeWage);
    }
}
