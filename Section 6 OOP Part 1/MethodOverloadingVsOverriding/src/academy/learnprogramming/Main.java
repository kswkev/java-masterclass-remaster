package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        GermanShepherd germanShepherd = new GermanShepherd();
        // calling overridden method
        germanShepherd.bark();

        // calling overloaded method
        germanShepherd.bark(4);
    }
}
