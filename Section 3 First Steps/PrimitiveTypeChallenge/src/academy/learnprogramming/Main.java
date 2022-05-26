package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLongTotal = 50000L + (10 * (myByte + myShort + myInt));

        System.out.println(myLongTotal);
    }

}
