import java.util.Random;

public class Main {
 // Method to compute employee wage
    public static void computeEmployeeWage() {
        final int IS_PRESENT = 1;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WORKING_DAY_PER_MONTH = 20;
        final int MAXIMUM_WORKING_HOURS = 100;
        final int MAXIMUM_WORKING_DAYS = 20;



        // Create a Random object
        Random random = new Random();

        // Generate random attendance (0 or 1)
        int attendance = random.nextInt(3); // Generates 0 or 1 and 2

        //System.out.println("Employee Attendance Check:");

       // System.out.println("Employee Daily Wage Calculation:");


        int totalWorkingHour = 0;
        int totalWorkingDay = 0;
        int totalMonthlyWages = 0;
        while(totalWorkingHour < MAXIMUM_WORKING_HOURS && totalWorkingDay < MAXIMUM_WORKING_DAYS) {

            attendance = random.nextInt(3);
            int empHours = 0;


            switch (attendance) {

                case IS_FULL_TIME:
                    empHours = FULL_DAY_HOURS;
                    System.out.println("Day " +(totalWorkingDay +1)  );
                    System.out.println("Full Time Hours Worked: " + empHours);
                    break;
                case IS_PART_TIME:
                    empHours = PART_TIME_HOURS;
                    System.out.println("Day " + (totalWorkingDay +1) + "Part Time Hours Worked " +empHours);
                    break;

                default:
                    System.out.println(" Day "+(totalWorkingDay +1)+  "Employee is Absent hours worked: 0");
            }
            totalWorkingHour +=empHours;

            if (totalWorkingHour > MAXIMUM_WORKING_HOURS) {
               // dailyHours -= (totalWorkingHour - MAXIMUM_WORKING_HOURS);
                totalWorkingHour = MAXIMUM_WORKING_HOURS;
            }

            // Calculate daily wage and add to the total wage
            int dailyWage = WAGE_PER_HOUR * empHours;
            totalMonthlyWages += dailyWage;
            System.out.println("Day " + totalWorkingDay + ": Worked " + empHours + " hours, Daily Wage: " + dailyWage);




            // Increment working days only if the employee worked
            if (empHours > 0) {
                totalWorkingDay++;
            }
        }
        System.out.println("Total working hours " + totalWorkingHour);
        System.out.println("Total working DAY " + totalWorkingDay);
        System.out.println("Total Monthly Wages " + totalMonthlyWages);
        }

  public static void main(String[] args) {
    System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
      computeEmployeeWage(); // Call the class method
 }
}