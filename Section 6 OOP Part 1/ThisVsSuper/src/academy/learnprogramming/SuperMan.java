package academy.learnprogramming;

public class SuperMan {

    private int age;
    private int height;

    public SuperMan() {
    }

    public SuperMan(int age) {
        this.age = age;
    }

    public SuperMan(int age, int height) {
        this(age);
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Printed in superclass");
    }
}
