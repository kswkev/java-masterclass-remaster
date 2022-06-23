package academy.learnprogramming;

import java.util.ArrayList;

class MyIntContainer {
    private int value;

    public MyIntContainer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {



    public static void main(String[] args) {
//        all of the following will cause syntax errors, can't use primatives with ArrayLists
//        ArrayList<int> intArrayList = new ArrayList<int>();
//        ArrayList<short> shortArrayList = new ArrayList<short>();
//        ArrayList<long> longArrayList = new ArrayList<long>();
//        ArrayList<double> doubleArrayList = new ArrayList<double>();
//        ArrayList<float> floatArrayList = new ArrayList<float>();
//        ArrayList<boolean> booleanArrayList = new ArrayList<boolean>();

//        this works because string is technically a class
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Kev");

//        this is one way to create an array using primatives
        ArrayList<MyIntContainer> myIntContainerArrayList = new ArrayList<>();
        myIntContainerArrayList.add(new MyIntContainer(10));
        System.out.println(myIntContainerArrayList.get(0).getValue());

//        the Integer class has methods to create integers from ints or Strings
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Integer myInteger = Integer.valueOf(3);
        integerArrayList.add(myInteger);
        integerArrayList.add(Integer.valueOf("6"));

        System.out.println(myInteger.intValue());
        System.out.println(myInteger);

//        intValue() will return an int
        System.out.println(integerArrayList.get(0).intValue());
        System.out.println(integerArrayList.get(1).intValue());

//        you don't need to use either of these value methods, the java complier will automatically do this for you
        ArrayList<Integer> autoIntegerArrayList = new ArrayList<>();
        autoIntegerArrayList.add(9);

        System.out.println(autoIntegerArrayList.get(0));
    }
}
