package edu.hw1;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] leftArray, int[] rightArray) {
        int leftMinimum = leftArray[0];
        int leftMaximum = leftArray[0];
        for (int position = 0; position < leftArray.length; position++) {
            if (leftMinimum > leftArray[position]) {
                leftMinimum = leftArray[position];
            }
            if (leftMaximum < leftArray[position]) {
                leftMaximum = leftArray[position];
            }
        }
        int rightMinimum = rightArray[0];
        int rightMaximum = rightArray[0];
        for (int position = 0; position < rightArray.length; position++) {
            if (rightMinimum > rightArray[position]) {
                rightMinimum = rightArray[position];
            }
            if (rightMaximum < rightArray[position]) {
                rightMaximum = rightArray[position];
            }
        }
        return (rightMinimum < leftMinimum && rightMaximum > leftMaximum);
    }
}
