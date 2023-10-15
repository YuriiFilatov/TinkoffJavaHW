package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static int countDigits(int number) {
        final int NUMBER_OF_DECIMAL_DIGITS = 10;
        int numberOfDigits = 0;
        int currentNum = number;
        do {
            numberOfDigits++;
            currentNum /= NUMBER_OF_DECIMAL_DIGITS;
        } while (currentNum != 0);
        return numberOfDigits;
    }
}
