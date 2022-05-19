package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        int myTotal = (myMinIntValue / 2);

        //byte myNewByteValue = (myMinByteValue / 2); this causes an issue because division returns an int
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }

}
