package academy.learnprogramming;

public class GermanShepherd extends Dog{

    @Override
    public void bark() {
        System.out.println("woof woof");
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("woof");
        }
    }
}
