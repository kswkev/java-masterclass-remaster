package academy.learnprogramming;

public class Main {

//    Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.
//
//
//NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
//
//NOTE: Do not add main method to solution code.

    public static void main(String[] args) {

        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(2);
        NumberInWord.printNumberInWord(3);
        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(6);
        NumberInWord.printNumberInWord(7);
        NumberInWord.printNumberInWord(8);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(10);
        NumberInWord.printNumberInWord(-1);
    }
}
