package academy.learnprogramming;

public class Main {

//    Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
//
//You should validate that the first parameter minutes is >= 0.
//
//You should validate that the 2nd parameter seconds is >= 0 and <= 59.
//
//The method should return gInvalid valueh in the method if either of the above are not true.
//
//If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.
//
//Create a 2nd method of the same name but with only one parameter seconds.
//
//Validate that it is >= 0, and return gInvalid valueh if it is not true.
//
//If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
//
//Call both methods to print values to the console.
//
//Tips:
//	Use int or long for your number data types is probably a good idea.
//	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
//	Methods should be static as we have used previously.
//
//Bonus:
//	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
//	Create a new console project and call it SecondsAndMinutesChallenge

    public static void main(String[] args) {

        System.out.println("0 min -1 sec = " + SecondsAndMinutes.getDurationString(0, -1));
        System.out.println("-1 min 0 sec = " + SecondsAndMinutes.getDurationString(-1, 0));
        System.out.println("0 min 61 sec = " + SecondsAndMinutes.getDurationString(0, 61));

        System.out.println("0 min 10 sec = " + SecondsAndMinutes.getDurationString(0, 10));
        System.out.println("5 min 1 sec = " + SecondsAndMinutes.getDurationString(5, 1));
        System.out.println("30 min 30 sec = " + SecondsAndMinutes.getDurationString(30, 30));
        System.out.println("64 min 5 sec = " + SecondsAndMinutes.getDurationString(64, 5));
    }
}
