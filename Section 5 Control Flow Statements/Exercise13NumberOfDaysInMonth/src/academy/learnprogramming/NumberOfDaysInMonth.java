package academy.learnprogramming;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {

        int returnValue;

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                returnValue = 31;
                break;
            case 2:
                returnValue = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                returnValue = 30;
                break;
            default:
                returnValue = -1;
                break;
        }


        return returnValue;
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}
