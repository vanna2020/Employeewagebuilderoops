package com.bridgelabz;
import java.util.Random;
 public class Main {
                    public static void main(String[] args) {
                        System.out.println("Welcome To Employee Wage Computation Program");

                        int IS_FULLTIME = 1;

                        Random random = new Random();
                        int empCheck = random.nextInt(2);
                        if (empCheck == IS_FULLTIME)
                            System.out.println("The Employee is Present");
                        else
                            System.out.println("The Employee is Absent");

                    }
                }

