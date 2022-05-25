package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!"); // will output
        }

        if (topScore != 100) {
            System.out.println("You didn't get the high score!"); // won't output
        }

        if (topScore > 100) {
            System.out.println("You got the high score!"); // won't output
        }

        if (topScore >= 100) {
            System.out.println("You got the high score!"); // will output
        }

        if (topScore < 100) {
            System.out.println("You didn't get the high score!"); // won't output
        }

        if (topScore <= 100) {
            System.out.println("You got the high score!"); // will output
        }

        topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and top score less than 100"); // will output
        }

        secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and top score less than 100"); // won't output
        }
    }
}
