package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.duplexPrinter = duplexPrinter;
    }

    public void refillToner() {
        this.tonerLevel = 100;
        System.out.println("Toner refilled");
    }

    public int addToner(int tonerAmount) {
        if (!(tonerAmount > 0 && tonerAmount <= 100) || this.tonerLevel + tonerAmount > 100) {
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public void printPage() {
        if (tonerLevel > 0) {
            System.out.println("Printing page");
            this.numberOfPagesPrinted++;
            this.tonerLevel -= 5;
        } else {
            System.out.println("Printer is out of toner");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
