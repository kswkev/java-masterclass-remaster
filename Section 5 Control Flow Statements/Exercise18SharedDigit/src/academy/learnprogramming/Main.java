package academy.learnprogramming;

public class Main {

//    Write a method named hasSharedDigit with two parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.

    public static void main(String[] args) {

        System.out.println("does 3 and 23 share any digits: " + SharedDigit.hasSharedDigit(3, 23));
        System.out.println("does 12 and 3 share any digits: " + SharedDigit.hasSharedDigit(12, 3));
        System.out.println("does 120 and 23 share any digits: " + SharedDigit.hasSharedDigit(120, 23));
        System.out.println("does 12 and 230 share any digits: " + SharedDigit.hasSharedDigit(12, 230));
        System.out.println("does 120 and 230 share any digits: " + SharedDigit.hasSharedDigit(120, 230));
        System.out.println("does 5 and 2 share any digits: " + SharedDigit.hasSharedDigit(5, 2));
        System.out.println("does -5 and -2 share any digits: " + SharedDigit.hasSharedDigit(-5, -2));

        System.out.println("");

        System.out.println("does 12 and 23 share any digits: " + SharedDigit.hasSharedDigit(12, 23));
        System.out.println("does 9 and 99 share any digits: " + SharedDigit.hasSharedDigit(9, 99));
        System.out.println("does 15 and 55 share any digits: " + SharedDigit.hasSharedDigit(15, 55));
        System.out.println("does 12 and 34 share any digits: " + SharedDigit.hasSharedDigit(12, 34));
    }

}
