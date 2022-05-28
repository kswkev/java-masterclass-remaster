package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        calculateAndPrintScore(true, 800, 5, 100);

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
    }

    public static void calculateAndPrintScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }
}
