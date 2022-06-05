package academy.learnprogramming;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int unsignedNum = number;

        if (number < 0) {
            unsignedNum *= -1;
        }

//        int reverseNumber = reverseNumber(unsignedNum);

        int reverseNumber = 0;
        int remaining =  unsignedNum;

        while (remaining > 0) {
            reverseNumber *= 10;
            reverseNumber += remaining % 10;
            remaining = remaining / 10;
        }

        return reverseNumber == unsignedNum;
    }

    // solution doesn't like extra methods

//    private static int reverseNumber(int number) {
//
//        int reverseNumber = 0;
//        int remaining =  number;
//
//        while (remaining > 0) {
//            reverseNumber *= 10;
//            reverseNumber += remaining % 10;
//            remaining = remaining / 10;
//        }
//
//        return reverseNumber;
//    }
}
