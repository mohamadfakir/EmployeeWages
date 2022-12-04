package com.employeewages;

    public class WageforMonth extends Case {
        public static final int isFullTime = 1, isPartTime = 2;

        public static void main(String[] args) {

            int TotalWage = 0;


            for (int Day = 1; Day <= 20; Day++) {

                int check = SwitchCase();

                switch (check) {

                    case isFullTime:
                        TotalWage += wager();
                        break;

                    case isPartTime:
                        TotalWage += partTimeWage();
                        break;

                    default:
                        TotalWage = 0;
                }

            }
            System.out.println("Employee Monthly wage = " + TotalWage);
        }
}
