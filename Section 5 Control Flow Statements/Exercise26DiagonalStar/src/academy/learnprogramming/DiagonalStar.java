package academy.learnprogramming;

public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int y=1; y<=number; y++) {
                String rowText = "";
                for (int x=1; x<=number; x++) {

                    if (y == 1 || y == number || y==x || (number - y + 1) == x || x==1 || x == number) {
                        rowText += "*";
                    } else {
                        rowText += " ";
                    }
                }

                System.out.println(rowText);
            }
        }
    }
}
