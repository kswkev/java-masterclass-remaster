package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        try {
            numberAsString = "2018a";
            System.out.println("numberAsString = " + numberAsString);
            number = Integer.parseInt(numberAsString);
            System.out.println("number = " + number);
        } catch (Exception ex) {
            System.out.println("Exception caught");
        }

        numberAsString = "2018.123";
        double doubleNo = Double.parseDouble(numberAsString);
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("doubleNo = " + doubleNo);

        numberAsString += 1;
        doubleNo += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("doubleNo = " + doubleNo);

    }
}
