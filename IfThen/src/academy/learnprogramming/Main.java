package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!"); //will output

        if (isAlien == true)
            System.out.println("It is not an alien!"); //won't output

        if (isAlien == false);
            System.out.println("It is not an alien!"); //will output

        if (isAlien == true);
            System.out.println("It is not an alien!"); //will output due to previous line's ;

        if (isAlien == false)
            System.out.println("It is not an alien!"); //will output
            System.out.println("And I am scared of aliens!"); //will output

        if (isAlien == true)
            System.out.println("It is not an alien!"); //won't output
            System.out.println("And I am scared of aliens!");   //will output due to not being covered by the condition

        if (isAlien == false) {
            System.out.println("It is not an alien!"); //will output
            System.out.println("And I am scared of aliens!"); //will output
        }

        if (isAlien == true) {
            System.out.println("It is not an alien!"); //won't output
            System.out.println("And I am scared of aliens!");   //won't output
        }

    }
}
