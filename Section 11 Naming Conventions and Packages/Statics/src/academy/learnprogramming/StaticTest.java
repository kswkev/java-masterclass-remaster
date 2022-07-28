package academy.learnprogramming;

public class StaticTest {

    private static int numInstances;
    private String name;

    static {
        numInstances = 0;
    }

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
