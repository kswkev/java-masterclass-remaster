package academy.learnprogramming;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 0) {
            return -1;
        }

        int largestFound = -1;

        for (int i=2; i <= number; i++) {

            boolean isPrime = true;
            for (int y=2; y < i; y++) {
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && number % i == 0) {
                largestFound = i;
            }
        }

        return largestFound;
    }
}
