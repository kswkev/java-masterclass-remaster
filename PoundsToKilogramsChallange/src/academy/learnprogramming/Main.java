package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        final double CONVERSION_RATE = 0.45359237;

        int lbs = 10;
        double kgs = lbs * CONVERSION_RATE;

        System.out.print(lbs + "lbs is equal to ");
        System.out.println(kgs + "kgs");
    }

}
