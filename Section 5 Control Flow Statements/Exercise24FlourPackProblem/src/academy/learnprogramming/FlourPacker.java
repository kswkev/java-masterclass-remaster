package academy.learnprogramming;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((bigCount * 5) + smallCount == goal) {
            return true;
        }

        if ((bigCount * 5) > goal && (goal % 5) <= smallCount) {
            return true;
        }

        if ((bigCount * 5) <= goal && ((bigCount * 5) + smallCount) >= goal) {
            return true;
        }

        return false;
    }
}
