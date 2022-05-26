package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;

        if (isEighteenOrOver) {
            System.out.println("You can drink legally, yay!");
        }
    }
}
