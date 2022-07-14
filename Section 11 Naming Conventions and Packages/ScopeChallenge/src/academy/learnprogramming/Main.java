package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter a value between 1 and 12");
        X x = new X(scanner.nextInt());
        x.x();

    }
}
