package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // value types
        System.out.println("value type examples:\n");

        int firstInt = 1;
        int secondInt = firstInt;

        System.out.println("Before change");
        System.out.println("firstInt = " + firstInt);
        System.out.println("secondInt = " + secondInt);
        System.out.println("");

        firstInt = 2;
        System.out.println("After change");
        System.out.println("firstInt = " + firstInt);
        System.out.println("secondInt = " + secondInt);
        System.out.println("");

        Integer firstInteger = 1;
        Integer secondInteger = firstInteger;

        System.out.println("Before change");
        System.out.println("firstInteger = " + firstInteger);
        System.out.println("secondInteger = " + secondInteger);
        System.out.println("");

        firstInteger = 2;
        System.out.println("After change");
        System.out.println("firstInteger = " + firstInteger);
        System.out.println("secondInteger = " + secondInteger);
        System.out.println("");

        int paramInt = 0;
        System.out.println("Before method call");
        System.out.println("paramInt = " + paramInt);
        System.out.println("");

        changeInt(paramInt);
        System.out.println("After method call");
        System.out.println("paramInt = " + paramInt);
        System.out.println("");

        Integer paramInter = 0;
        System.out.println("Before method call");
        System.out.println("paramInter = " + paramInter);
        System.out.println("");

        changeInteger(paramInter);
        System.out.println("After method call");
        System.out.println("paramInter = " + paramInter);
        System.out.println("");

        //reference types
        System.out.println("reference type examples:\n");

        int[] firstIntArray = new int[5];
        int[] secondIntArray = firstIntArray;

        System.out.println("Before change");
        System.out.println("firstIntArray = " + Arrays.toString(firstIntArray));
        System.out.println("secondIntArray = " + Arrays.toString(secondIntArray));
        System.out.println("");

        firstIntArray[0] = 1;
        System.out.println("After change");
        System.out.println("firstIntArray = " + Arrays.toString(firstIntArray));
        System.out.println("secondIntArray = " + Arrays.toString(secondIntArray));
        System.out.println("");

        CustomObject customObject = new CustomObject(1);
        CustomObject customObject1 = customObject;

        System.out.println("Before change");
        System.out.println("customObject int field = " + customObject.getIntField());
        System.out.println("customObject int field = " + customObject1.getIntField());
        System.out.println("");

        customObject.setIntField(2);

        System.out.println("After change");
        System.out.println("customObject int field = " + customObject.getIntField());
        System.out.println("customObject int field = " + customObject1.getIntField());
        System.out.println("");

        int[] paramIntArray = new int[5];
        System.out.println("Before method call");
        System.out.println("paramIntArray = " + Arrays.toString(paramIntArray));
        System.out.println("");

        changeArray(paramIntArray);
        System.out.println("After method call");
        System.out.println("paramIntArray = " + Arrays.toString(paramIntArray));
        System.out.println("");

        CustomObject customParamObject = new CustomObject(1);
        System.out.println("Before method call");
        System.out.println("customObject int field = " + customParamObject.getIntField());
        System.out.println("");

        changeCustomObject(customParamObject);
        System.out.println("After method call");
        System.out.println("customObject int field = " + customParamObject.getIntField());
        System.out.println("");
    }

    private static void changeInt(int myInt) {
        myInt = 2;
    }

    private static void changeInteger(Integer myInt) {
        myInt = 2;
    }

    private static void changeArray(int[] myInt) {
        myInt[0] = 2;
    }

    private static void changeCustomObject(CustomObject customObject) {
        customObject.setIntField(2);
    }
}

class CustomObject {

    int intField;

    public CustomObject(int intField) {
        this.intField = intField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }
}