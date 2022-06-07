package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numCount = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                numCount++;
            } else {
                break;
            }
        }

        int ave = 0;
        if (numCount > 0) {
            ave = (int) Math.round(( (double) sum / (double) numCount));
        }

        System.out.println("SUM = " + sum + " AVG = " + ave);

        scanner.close();

    }
}
