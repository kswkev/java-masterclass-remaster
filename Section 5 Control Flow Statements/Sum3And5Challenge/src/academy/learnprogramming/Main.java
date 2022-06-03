package academy.learnprogramming;

public class Main {

//    Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//Sum all the numbers that can be divided with both 3 and also with 5.
//
//For those numbers that met the above conditions, print out the number.
//
//break out of the loop once you find 5 numbers that met the above conditions.
//
//After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//Note: Type all code in main method

    public static void main(String[] args) {

        int start = 1;
        int end = 1000;
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end && count <= 5 ; i++) {
            if (divisibleBy3And5(i)) {
                System.out.println("Found number = " + i);
                sum += i;
                count++;
            }
        }

        System.out.println("Sum = " + sum);
    }

    public static boolean divisibleBy3And5(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }
}
