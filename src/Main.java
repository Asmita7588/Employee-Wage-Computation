import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        final int IS_PRESENT = 1;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WORKING_DAY_PER_MONTH = 20;


        // Create a Random object
        Random random = new Random();

        // Generate random attendance (0 or 1)
        int attendance = random.nextInt(3); // Generates 0 or 1 and 2

        System.out.println("Employee Attendance Check:");

        System.out.println("Employee Daily Wage Calculation:");

        int totalMonthlyWages = 0;
        for(int day = 1; day<= WORKING_DAY_PER_MONTH; day++) {

            attendance = random.nextInt(3);
            int dailyWage = 0;



            switch (attendance) {

                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                    System.out.println("Day " +day );
                    System.out.println("Daily Wage: " + dailyWage);
                    break;
                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                    System.out.println("Employee is Part tIME");
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            totalMonthlyWages += dailyWage;
        }
        System.out.println("Total Monthly Wages: " + totalMonthlyWages);
    }
}
