package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        boolean isFound = false;
        int remainingFirst = number1;

        while (remainingFirst > 0  && !isFound) {
            int currentFirstDigit = remainingFirst % 10;
            remainingFirst /= 10;

            int remainingSecond = number2;
            while (remainingSecond > 0 && !isFound) {
                int currentSecondDigit = remainingSecond % 10;
                remainingSecond /= 10;

                if (currentFirstDigit == currentSecondDigit) {
                    isFound = true;
                }

            }
        }

        return isFound;
    }
}
