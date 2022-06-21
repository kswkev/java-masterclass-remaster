package academy.learnprogramming;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        for (int i=0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
