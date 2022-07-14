package com.kswkev.com.kswkev.Math;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i=0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i=0; i <= n; i++) {
            factorial *= i;
            if (i == 1) {
                factorial = 1;
            }
        }
        return factorial;
    }

    public static int fibonacci(int n) {
        int n1 = 0;
        int n2 = 0;
        int current = 0;
        for (int i=0; i <= n; i++) {
            if (i == 0) {
                current = 0;
            } else if (i == 1) {
                current = 1;
                n1 = current;
            } else {
                current = n1 + n2;
                n2 = n1;
                n1 = current;
            }
        }
        return current;
    }

//    nicer way of doing fibonacci with recurrent calls
    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
