package com.employeewages;

    public class MultipleCompany {
        
        private static final int isFullTime = 1;
        private static final int isPartTime = 2;
        private static final int isAbsent = 0;

        private String companyName;
        private int maxWorkingHrs;
        private int daysInMonth;
        private int wagePerHr;

        MultipleCompany(String companyName, int maxWorkingHrs, int daysInMonth, int wagePerHr) {
            this.companyName = companyName;
            this.maxWorkingHrs = maxWorkingHrs;
            this.daysInMonth = daysInMonth;
            this.wagePerHr = wagePerHr;
        }

        public static void main(String[] args) {

            MultipleCompany e1 = new MultipleCompany("Dmart", 100, 20, 100);
            MultipleCompany e2 = new MultipleCompany("JioMart", 120, 25, 80);
            e1.employeewage();
            e2.employeewage();
        }

        void employeewage() {
            int workingHr = 0;
            int totalWorkingHr = 0;
            int monthlyTotalWage = 0;
            int dailyWagArray[] = new int[daysInMonth];
            int days = 0;

            while (days < daysInMonth && totalWorkingHr < maxWorkingHrs) {
                int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
                switch (empCheck) {
                    case isFullTime:
                        workingHr = 8;
                        break;
                    case isPartTime:
                        workingHr = 4;
                        break;
                    case isAbsent:
                        workingHr = 0;
                        break;
                }
                totalWorkingHr += workingHr;
                dailyWagArray[days] = workingHr * wagePerHr;
                days++;
            }
            for (int j = 0; j < daysInMonth; j++) {
                int day = j + 1;
                System.out.println("Day " + day + " wage is " + dailyWagArray[j]);
                monthlyTotalWage = monthlyTotalWage + dailyWagArray[j];
            }
            System.out.println("Monthly wage for " + companyName + " : " + monthlyTotalWage + "\n");
        }
    }

