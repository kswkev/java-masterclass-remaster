package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {

    private static final long MINS_IN_YEAR = 365 * 24 * 60;
    private static final long MINS_IN_DAY = 24 * 60;

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long remainingMins = minutes;

            long years = remainingMins / MINS_IN_YEAR;
            remainingMins %= MINS_IN_YEAR;

            long days = remainingMins / MINS_IN_DAY;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
