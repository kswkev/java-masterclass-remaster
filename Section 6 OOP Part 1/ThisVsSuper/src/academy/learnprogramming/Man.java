package academy.learnprogramming;

public class Man extends SuperMan {

    private String name;

    public Man() {
    }

    public Man(int age, int height, String name) {
        super(age, height);
        this.name = name;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Printed in subclass");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
