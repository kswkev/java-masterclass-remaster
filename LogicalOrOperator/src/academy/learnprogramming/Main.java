package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int topScore = 80;
        int secondTopScore = 81;
        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true"); //will output
        }

        secondTopScore = 95;
        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true"); //won't output
        }
    }
}
