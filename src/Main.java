import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        final int IS_PRESENT = 1;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;


        // Create a Random object
        Random random = new Random();

        // Generate random attendance (0 or 1)
        int attendance = random.nextInt(2); // Generates 0 or 1

        System.out.println("Employee Attendance Check:");

        System.out.println("Employee Daily Wage Calculation:");

        // Check if the employee is present or absent
        if (attendance == IS_PRESENT) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Present");
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage: 0");
        }
    }
}
