package academy.learnprogramming;

public class LastDigitChecker {

    private static final int BOTTOM_OF_RANGE = 10;
    private static final int TOP_OF_RANGE = 1000;

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        return lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3;
    }

    public static boolean isValid(int number) {
        return number >= BOTTOM_OF_RANGE && number <= TOP_OF_RANGE;
    }
}
