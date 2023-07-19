package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");
        //UC1:Check Employee is Present or Absent
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employee is Absent");
    }
}
