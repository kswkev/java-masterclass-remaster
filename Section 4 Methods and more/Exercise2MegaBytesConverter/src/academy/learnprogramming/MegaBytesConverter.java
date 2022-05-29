package academy.learnprogramming;

public class MegaBytesConverter {

    public static final int CONVERSION_RATE = 1024;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / CONVERSION_RATE;
            int kb = kiloBytes % CONVERSION_RATE;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }

}
