import java.util.Random;

public class Main {
 // Method to compute employee wage
    public static void  computeEmployeeWage(String company, int WAGE_PER_HOUR, int MAXIMUM_WORKING_DAYS, int MAXIMUM_WORKING_HOURS) {


        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        Random random = new Random();

        int totalWorkingHour = 0;
        int totalWorkingDay = 0;
        int totalMonthlyWages = 0;
        System.out.println("\nComputing wages for " + company);
        while(totalWorkingHour < MAXIMUM_WORKING_HOURS && totalWorkingDay < MAXIMUM_WORKING_DAYS) {
          totalWorkingHour++;

          int workHours = 0;
          int  attendance = random.nextInt(3);

            switch (attendance) {

                case IS_FULL_TIME:
                    workHours = FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME:
                    workHours = PART_TIME_HOURS;
                    break;

                default:
                    workHours = 0;
                    break;
            }
            totalWorkingHour +=workHours;

            if (totalWorkingHour > MAXIMUM_WORKING_HOURS) {
                workHours -= (totalWorkingHour - MAXIMUM_WORKING_HOURS);
                totalWorkingHour = MAXIMUM_WORKING_HOURS;
            }

            // Calculate daily wage and add to the total wage
            int dailyWage = WAGE_PER_HOUR * workHours;
            totalMonthlyWages += dailyWage;
            System.out.println("Day " + totalWorkingDay + ": Worked " + workHours + " hours, Daily Wage: " + dailyWage);
        }
        System.out.println("Total working hours " + totalWorkingHour);
        System.out.println("Total working DAY " + totalWorkingDay);
        System.out.println("Total Monthly Wages " + totalMonthlyWages);
        }

  public static void main(String[] args) {

    System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
      computeEmployeeWage("Company A", 20, 20, 100);
      computeEmployeeWage("Company B", 25, 22, 120);
      computeEmployeeWage("Company C", 30, 18, 80);
 }
}