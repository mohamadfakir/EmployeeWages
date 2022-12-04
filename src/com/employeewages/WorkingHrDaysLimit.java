package com.employeewages;

    public class WorkingHrDaysLimit extends WageforMonth {
        
        public static final int isFullTime = 1, isPartTime = 2;
        static int max_working_hrs = 100;
        static int days_in_month = 20;
        static int workingHrs = 0;
        static int wagePerHrs = 20;
        static int totalWorkingHr = 0;
        static int monthly_total_wage = 0;
        static int daily_wage_array[] = new int[20];

        public static void main(String[] args) {
            for (int i = 0; i < days_in_month && totalWorkingHr < max_working_hrs; i++) {

                int check = SwitchCase();

                switch (check) {
                    case 1:
                        System.out.println("Employee is Present");
                        workingHrs = 8;
                        break;

                    case 2:
                        System.out.println("Employee is parttime Present");
                        workingHrs = 4;
                        break;

                    default:
                        System.out.println("Employee is absent");
                        workingHrs = 0;

                }

                daily_wage_array[i] = workingHrs * wagePerHrs;
            }
            for (int j = 0; j < days_in_month; j++) {

                int day = j + 1;
                System.out.println(" Day " + day + " wage is " + daily_wage_array[j]);
                monthly_total_wage = monthly_total_wage + daily_wage_array[j];
            }
            System.out.println("\n Monthly wage is " + monthly_total_wage);

        }
}
