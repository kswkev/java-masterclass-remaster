package academy.learnprogramming;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int reverse = reverse(number);
            int currentDigit;

            for (int i=0; i < getDigitCount(number); i++) {

                currentDigit = reverse % 10;
                reverse /= 10;

                switch (currentDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        int remainingNumber = number;

        do {
            reverse *= 10;
            reverse += remainingNumber % 10;
            remainingNumber /= 10;
        } while (remainingNumber != 0);

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        int remainingNumber = number;

        do {
            count++;
            remainingNumber /= 10;
        } while (remainingNumber != 0);

        return count;
    }
}
