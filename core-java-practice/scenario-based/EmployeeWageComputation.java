import java.util.*;
class EmployeeWageComputation{
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to Employee Wage Computation Program");
        //UC1
        System.out.println("UC1: Employee Attendance");
        int attendance = random.nextInt(2); // 0 or 1
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        //UC2
        System.out.println("UC2: Calculate Daily Employee Wage");
        int fullDayHour= 8;
        int wagePerHour= 20;
        int dailyWage= fullDayHour*wagePerHour;
        System.out.println("Daily Wage = "+dailyWage);
        //UC3
        System.out.println("UC3 : Add Part Time Employee & Wage");
        int partTimeHour= 4;
        int partTimeWage= partTimeHour*wagePerHour;
        System.out.println("Part Time Wage = ₹" + partTimeWage);

        //UC4 
        System.out.println("UC4 : Solve Using Switch Case");

        int atten= random.nextInt(2); // 0 or 1
        switch (atten) {
            case 1:
                System.out.println("Employee is Present");
                break;
            default:
                System.out.println("Employee is Absent");
        }

        //UC5
        System.out.println("UC5: Calculating Wages for a Month Assume 20 Working Day per Month");
        int monthlyWage = 0;
        for (int day= 1; day<= 20; day++) {
            int type= random.nextInt(3);
            int hours= 0;
            if (type== 1)
                hours= 8;
            else if (type== 2)
                hours= 4;
            monthlyWage= monthlyWage + (hours * wagePerHour);
        }
        System.out.println("Monthly Wage (20 Days) = ₹" + monthlyWage);
        //UC6
        System.out.println("UC6 : Wage Till Max 100 Hours or 20 Days");
        int totalDays = 0;
        int totalHours = 0;
        int totalSalary = 0;
        while (totalDays < 20 && totalHours < 100) {
            totalDays++;
            int type = random.nextInt(3);
            int hours = 0;
            if (type == 1)
                hours = 8;
            else if (type == 2)
                hours= 4;
            totalHours= totalHours+hours;
            totalSalary= totalSalary + (hours*wagePerHour);
        }
        System.out.println("Total Working Days = " + totalDays);
        System.out.println("Total Working Hours = " + totalHours);
        System.out.println("Total Wage = ₹" + totalSalary);
    }
}
