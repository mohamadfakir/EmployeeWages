package com.employeewages;

import java.util.Random;

public class PresentAbsent {
        
        public static int Attendence() {
            Random random = new Random();
            int num = random.nextInt(2);
            return num;
        }

        public static void main(String args[]) {
            System.out.println("Welcome to Employee Wage Computation");

            int check = Attendence();
            int isPresent = 1, isAbsent = 2;
            if (check == isPresent) {
                System.out.println("Employee is Present");
            }
            else {
                System.out.println("Employee is Absent");
            }
        }

    }

