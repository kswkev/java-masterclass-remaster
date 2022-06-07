package academy.learnprogramming;

import java.util.Scanner;

public class Main {

//    -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message �gEnter number:�h
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.
//
//Bonus:
//-Create a project with the name MinAndMaxInputChallenge.

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                int current = scanner.nextInt();

                if (current < min) {
                    min = current;
                }

                if (current > max) {
                    max = current;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle new line char
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        scanner.close();
    }
}
