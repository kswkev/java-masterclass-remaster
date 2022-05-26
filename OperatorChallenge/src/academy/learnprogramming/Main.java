package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double twenty = 20.00d;
        double eighty = 80.00d;

        double total = (twenty + eighty) * 100.00d;
        double remainder = total % 40.00d;

        boolean isZero = remainder == 0.0 ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
