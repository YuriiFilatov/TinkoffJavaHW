package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private Task6() {
    }

    public static int countK(int number) {
        final int KAPREKAR_NUM = 6174;

        if (number == KAPREKAR_NUM) {
            return 0;
        }
        String numInString = Integer.toString(number);
        char[] numInCharArray = numInString.toCharArray();
        Arrays.sort(numInCharArray);
        String sortedNumber = new String(numInCharArray);
        for (int position = 0; position < numInCharArray.length / 2; position++) {
            char temp = numInCharArray[position];
            numInCharArray[position] = numInCharArray[numInCharArray.length - 1 - position];
            numInCharArray[numInCharArray.length - 1 - position] = temp;
        }
        String reversedSortedNumber = new String(numInCharArray);
        return 1 + countK(Integer.parseInt(reversedSortedNumber) - Integer.parseInt(sortedNumber));
    }
}
