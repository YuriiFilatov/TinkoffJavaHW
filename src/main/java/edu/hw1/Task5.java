package edu.hw1;

public class Task5 {
    private Task5() {
    }

    public static boolean isPalindromeDescendant(int number) {
        String numInString = Integer.toString(number);
        boolean isPalindrom = true;
        for (int leftPos = 0, rightPos = numInString.length() - 1; leftPos < rightPos; leftPos++, rightPos--) {
            if (numInString.charAt(leftPos) != numInString.charAt(rightPos)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            return true;
        }
        String nextStepNumber = "";
        for (int position = 0; position < numInString.length(); position += 2) {
            if (position + 1 < numInString.length()) {
                nextStepNumber += Integer.toString((numInString.charAt(position) - '0')
                    + (numInString.charAt(position + 1) - '0'));
            } else {
                nextStepNumber += numInString.charAt(position);
            }
        }
        if (nextStepNumber.length() > 1) {
            return isPalindromeDescendant(Integer.parseInt(nextStepNumber));
        } else {
            return false;
        }
    }
}
