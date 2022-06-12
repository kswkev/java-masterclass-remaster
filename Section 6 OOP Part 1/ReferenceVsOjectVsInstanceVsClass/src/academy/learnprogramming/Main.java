package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println("blueHouse.colour = " + blueHouse.getColour());
        System.out.println("anotherHouse.colour = " + blueHouse.getColour());

        // sets the colour of both houses to red
        anotherHouse.setColour("red");

        System.out.println("blueHouse.colour = " + blueHouse.getColour());
        System.out.println("anotherHouse.colour = " + blueHouse.getColour());
    }
}
