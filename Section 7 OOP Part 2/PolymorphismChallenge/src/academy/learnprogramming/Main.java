package academy.learnprogramming;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Car engine starting, purr");
    }

    public void accelerate() {
        speed += 1;
        System.out.println("Car speed increased to " + speed);
    }

    public void brake() {
        speed -= 1;
        System.out.println("Car speed reduced to " + speed);
    }
}

class Mini extends Car {
    public Mini() {
        super("Mini", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Mini engine starting, weee");
    }

    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 1);
        System.out.println("Mini speed increased to " + getSpeed());
    }

    @Override
    public void brake() {
        setSpeed(getSpeed() - 1);
        System.out.println("Mini speed reduced to " + getSpeed());
    }
}

class Lambo extends Car {
    public Lambo() {
        super("Lambo", 12);
    }

    @Override
    public void startEngine() {
        System.out.println("Lambo engine starting, VROOOOOM!");
    }

    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 5);
        System.out.println("Lambo speed increased to " + getSpeed());
    }

    @Override
    public void brake() {
        setSpeed(getSpeed() - 5);
        System.out.println("Lambo speed reduced to " + getSpeed());
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Jeep engine starting, PURRRRR!");
    }

    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 2);
        System.out.println("Jeep speed increased to " + getSpeed());
    }

    @Override
    public void brake() {
        setSpeed(getSpeed() - 2);
        System.out.println("Jeep speed reduced to " + getSpeed());
    }
}


public class Main {

    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generice car calss.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    public static void main(String[] args) {

        Car mini = new Mini();
        testCar(mini);
        System.out.println("");

        Car lambo = new Lambo();
        testCar(lambo);
        System.out.println("");

        Car jeep = new Jeep();
        testCar(jeep);
    }

    private static void testCar(Car car) {
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
