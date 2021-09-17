package com.bridgelabz;
import java.util.Random;
 public class Main {
     public static void main(String[] args) {
         System.out.println("Welcome To Employee Wage Computation Program");
         int IS_FULLTIME = 1;
         int Emp_Rate_PerHr = 20;

         int empHrs = 0;
         int empWage = 0;

         Random random = new Random();
         int empCheck = random.nextInt(2);
         if (empCheck == IS_FULLTIME)
             empHrs = 8;
         else
             empHrs = 0;
         empWage = Emp_Rate_PerHr * empHrs;
         System.out.println("The daily wage of an employee is : " + empWage);
     }
 }