package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;
        printArray(myIntArray);

        double[] myDoubleArray = {1.00, 1.50, 1.75, 2.10};
        printArray(myDoubleArray);

        int[] myCalculatedArray = new int[20];
        for (int i=0; i < myCalculatedArray.length; i++) {
            myCalculatedArray[i] = i  * 10;
        }
        printArray(myCalculatedArray);

        int[] myErrorArray = new int[10];
        try {
            //10 element doesn't exist only 0-9
            myErrorArray[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error thrown");
        }

        int[] myInput = getIntegers(5);
        printArray(myInput);
        System.out.println("The average is: " + average(myInput));

    }

    public static void printArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Element: " + i + " Value: " + array[i]);
        }
    }

    public static void printArray(double[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Element: " + i + " Value: " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
