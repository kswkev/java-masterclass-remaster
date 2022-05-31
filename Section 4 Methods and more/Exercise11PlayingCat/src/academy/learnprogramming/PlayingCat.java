package academy.learnprogramming;

public class PlayingCat {

    private static final int LOWER_TEMP_LIMIT = 25;
    private static final int UPPER_TEMP_LIMIT = 35;
    private static final int UPPER_SUMMER_TEMP_LIMIT = 45;

    public static boolean isCatPlaying(boolean summer, int temperature) {

        return temperature >= LOWER_TEMP_LIMIT && ((!summer && temperature <= UPPER_TEMP_LIMIT) || summer && temperature <= UPPER_SUMMER_TEMP_LIMIT);
    }
}
