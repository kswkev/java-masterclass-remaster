package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator(1, 2);
        // using the instance method
        System.out.println(calc.sum());

        // using the static method
        System.out.println(Calculator.sum(3, 4));
    }
}
