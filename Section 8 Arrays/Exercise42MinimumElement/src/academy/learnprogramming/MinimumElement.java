package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static int readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to provide:\r");
        int number = scanner.nextInt();
        return number;
    }

    public static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[numberOfElements];

        System.out.println("Please enter " + numberOfElements + " numbers:\r");
        for(int i=0;  i<numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }

        return numberArray;
    }

    public static int findMin(int[] numberArray) {
        Arrays.sort(numberArray);
        return numberArray[0];
    }
}
