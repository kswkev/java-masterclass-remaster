package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[capacity];

        System.out.println("Please enter " + capacity + " integers for sorting:\r");

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);

        for (int i=0; i < (sorted.length / 2) + (sorted.length % 2); i++) {
            int temp;
            temp = sorted[i];
            sorted[i] = sorted[array.length - i - 1];
            sorted[array.length - i - 1] = temp;
        }

        return sorted;
    }
}
