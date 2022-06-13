package academy.learnprogramming;

public class Dog {

    private String name;
    private static String colour;

    public Dog(String name, String colour) {
        this.name = name;
        Dog.colour = colour;
    }

    public void print() {
        System.out.println("This is my dog " + name + " and he is " + colour);
    }
}
