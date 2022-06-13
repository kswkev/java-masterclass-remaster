package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dog milo = new Dog("Milo", "tan");
        Dog isla = new Dog("Isla", "white");

        milo.print();
        isla.print();

        //Milo and Isla share the same colour variable
    }
}
