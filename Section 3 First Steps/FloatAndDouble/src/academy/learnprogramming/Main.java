package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min = " + myMinFloatValue);
        System.out.println("Float max = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min = " + myMinDoubleValue);
        System.out.println("Double max = " + myMaxDoubleValue);

        //double myDouble = 5.25; can also be used
        double myDouble = 5.25d;

        //float myFloat = 5.25; will error but can be cast using (float) 5.25 or 5.25f
        float myFloat = 5.25f;
    }
}
