package com.employeewages;

public class DailyWage extends PresentAbsent {
    
    public static int wager() {
        int wagePerHr = 20;
        int workingHrs = 8;
        int dailyWage = wagePerHr * workingHrs;
        return dailyWage;
    }

    public static void main(String[] args) {

        int attendence = Attendence();
        int isPresent = 1, isAbsent = 0;
        if (attendence == isPresent) {
            System.out.println("Employee's Daily wage is " + wager());
        }
        else {
            System.out.println("Employee's Daily wage is " + isAbsent);
        }
    }

}

