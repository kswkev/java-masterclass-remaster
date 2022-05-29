package academy.learnprogramming.academy.learnprogramming;

public class SpeedConverter {

    private static final double CONVERSION = 1.609;

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / CONVERSION);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }

}
