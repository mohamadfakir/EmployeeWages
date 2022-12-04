package com.employeewages;

    import java.util.Random;

    public class Case extends PartTimeWage{
        public static final int isFullTime = 1, isPartTime = 2;
        public static int SwitchCase() {
            Random random = new Random();
            int num = random.nextInt(3);
            return num;
        }

        public static void main(String[] args) {

            int check = SwitchCase();

            switch (check) {

                case isFullTime:

                    System.out.println("Employee Full day Wager = " + wager());
                    break;

                case isPartTime:

                    System.out.println("Employee Part time Wager = " + partTimeWage());
                    break;

                default:
                    System.out.println("Employee is Absent"); // Absent
            }
        }

    }
