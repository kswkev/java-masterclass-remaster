package academy.learnprogramming;

public class SecondsAndMinutes {

    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = 3600;

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int totalSeconds = seconds + (minutes * SECONDS_IN_MINUTE);
        return getDurationString(totalSeconds);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int calculatedHours = 0;
        int calculatedMinutes = 0;
        int calculatedSeconds = 0;
        int remaingSeconds = seconds;

        calculatedHours = remaingSeconds / SECONDS_IN_HOUR;
        remaingSeconds %= SECONDS_IN_HOUR;

        calculatedMinutes = remaingSeconds / SECONDS_IN_MINUTE;
        remaingSeconds %= SECONDS_IN_MINUTE;

        String hourText = formatNumber(calculatedHours);
        String minuteText = formatNumber(calculatedMinutes);
        String secondText = formatNumber(remaingSeconds);

        return hourText + "h " + minuteText + "m " + secondText + "s";

    }

    private static String formatNumber(int number) {
        String text = Integer.toString(number);
        if (text.length() == 1) {
            text = "0" + text;
        }
        return text;
    }
}
