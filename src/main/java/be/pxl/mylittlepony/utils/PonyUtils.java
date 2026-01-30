package be.pxl.mylittlepony.utils;


public class PonyUtils {
    public PonyUtils() {

    }

    public static int addOnlyIfPos(int one, int two) {
        if (one < 0 || two < 0) {
            throw new IllegalArgumentException("only positive numbers plx");
        }

        return one + two;
    }
}
