package academy.learnprogramming;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int evenSum = 0;
        int remainingNumber = number;

        while (remainingNumber > 0) {
            int currentDigit = remainingNumber % 10;

            if (currentDigit % 2 == 0){
                evenSum += currentDigit;
            }

            remainingNumber /= 10;
        }

        return evenSum;
    }
}
