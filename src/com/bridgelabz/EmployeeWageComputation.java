package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");
        
        int wagePerHour = 20;
        int workingHour = 0;
        int workingDays = 20;
        int maxWorkingHours = 100;
        int monthlyWage = 0;
        int dailyWage = 0;
        int day = 1;

        while (day <= workingDays && workingHour <= maxWorkingHours) {
            Random random = new Random();
            int attendance = random.nextInt(3);
            System.out.println("Day => "+day);
            switch (attendance) {
                case 0:
                    System.out.println("Employee is Absent");
                    workingHour = 0;
                    break;
                case 1:
                    System.out.println("Employee is Present");
                    workingHour = 8;
                    break;
                case 2:
                    System.out.println("Employee is Part-Time");
                    workingHour = 4;
                    break;
            }
            day++;
            dailyWage = workingHour * wagePerHour;
            monthlyWage += dailyWage;
            //maxWorkingHours += workingHour;
            System.out.println("Employee Daily Wage : " +dailyWage);
           //System.out.println("Employee Total Working Hours : "+maxWorkingHours);
        }
        System.out.println("**************************************************");
        System.out.println("Employee Monthly Wage : " +monthlyWage+" $");
    }
}
