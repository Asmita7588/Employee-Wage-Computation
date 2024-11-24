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


        // Create a Random object
        Random random = new Random();

        // Generate random attendance (0 or 1)
        int attendance = random.nextInt(3); // Generates 0 or 1 and 2

        System.out.println("Employee Attendance Check:");

        System.out.println("Employee Daily Wage Calculation:");

        int dailyWage = 0;
        // Check if the employee is present or absent
        if (attendance == IS_FULL_TIME) {
             dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Full Time");
            System.out.println("Daily Wage: " + dailyWage);
        } else if (attendance == IS_PART_TIME){
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Employee is Part tIME");
        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage: " + dailyWage);
    }
}
