package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4:case 5:
                System.out.println("Value was either 3, 4, or 5");
                break;

            default:
                System.out.println("Was not 1-5");
                break;
        }


        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char character = 'A';

        switch (character) {
            case 'A':
                System.out.println("an A was found");
                break;

            case 'B':
                System.out.println("an B was found");
                break;

            case 'C':
                System.out.println("an C was found");
                break;

            case 'D':
                System.out.println("an D was found");
                break;

            case 'E':
                System.out.println("an E was found");
                break;

            default:
                System.out.println("Didn't find A-E");
                break;
        }
    }
}
