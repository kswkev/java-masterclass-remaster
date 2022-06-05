package academy.learnprogramming;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int first;
        int last;

//        first = findFirst(number);
//        last = findLast(number);

        first = number % 10;

        int remaining = number;
        last = number;

        while (remaining > 0) {
            last = remaining % 10;
            remaining /= 10;
        }

        return first + last;

    }

//    private static int findFirst(int number) {
//
//        return number % 10;
//    }
//
//    private static int findLast(int number) {
//
//        int remaining = number;
//        int last = number;
//
//        while (remaining > 0) {
//            last = remaining % 10;
//            remaining /= 10;
//        }
//
//        return last;
//    }
}
