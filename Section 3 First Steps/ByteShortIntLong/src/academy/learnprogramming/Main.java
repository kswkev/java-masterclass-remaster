package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //-2,147,483,648 - 2,147,483,647
        //2^31 values plus 1 bit for -/+
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min  = " + myMinIntValue);
        System.out.println("Integer Max  = " + myMaxIntValue);
        System.out.println("Busted Max value  = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value  = " + (myMinIntValue - 1));

        //Below will cause a complation error
        //int brokenInt = 2147483648;

        //-128 - 127
        //2^7 values plus 1 bit for -/+
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min  = " + myMinByteValue);
        System.out.println("Byte Max  = " + myMaxByteValue);

        //-32,768 - 32,767
        //2^15 values plus 1 bit for -/+
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min  = " + myMinShortValue);
        System.out.println("Short Max  = " + myMaxShortValue);

        //-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
        //2^63 values plus 1 bit for -/+
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min  = " + myMinLongValue);
        System.out.println("Long Max  = " + myMaxLongValue);
    }
}
