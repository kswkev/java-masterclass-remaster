package academy.learnprogramming;

public class Main {

//    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//The method should not return any value (hint: void)
//
//Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//Bonus:
//	Write a second solution using if then else, instead of using switch.
//	Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        printDayOfTheWeekUsingIf(0);
        printDayOfTheWeekUsingIf(1);
        printDayOfTheWeekUsingIf(2);
        printDayOfTheWeekUsingIf(3);
        printDayOfTheWeekUsingIf(4);
        printDayOfTheWeekUsingIf(5);
        printDayOfTheWeekUsingIf(6);
        printDayOfTheWeekUsingIf(7);
    }

    public static void printDayOfTheWeek(int day) {

        String dayName;

        switch (day) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid Value";
                break;
        }

        System.out.println(dayName);
    }

    public static void printDayOfTheWeekUsingIf(int day) {

        String dayName;

        if (day == 0) {
            dayName = "Sunday";
        } else if (day == 1) {
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        } else if (day == 4) {
            dayName = "Thrusday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Saturday";
        } else {
            dayName = "Invalid Value";
        }


        System.out.println(dayName);
    }
}
