package edu.hw1;

public class Task1 {
    private Task1() {
    }

    public static int minutesToSecond(String videoLength) {
        final int SECONDS_POSITION = 0;
        final int MINUTES_POSITION = 1;
        final int SECONDS_IN_MINUTE = 60;
        String[] timeFragments = videoLength.split(":");
        if (timeFragments.length != 2 || timeFragments[SECONDS_POSITION].length() != 2) {
            return -1;
        }

        int hours = Integer.parseInt(timeFragments[MINUTES_POSITION]);
        int minutes = Integer.parseInt(timeFragments[SECONDS_POSITION]);

        if (minutes >= SECONDS_IN_MINUTE) {
            return -1;
        }

        return SECONDS_IN_MINUTE * hours + minutes;
    }
}
