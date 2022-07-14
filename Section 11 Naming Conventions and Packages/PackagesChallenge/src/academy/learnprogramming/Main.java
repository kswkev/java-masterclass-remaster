package academy.learnprogramming;

import com.kswkev.com.kswkev.Math.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("nSum values");
        for (int i =0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("");

        System.out.println("factorial values");
        for (int i =0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("");

        System.out.println("fibonacci values");
        for (int i =0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
