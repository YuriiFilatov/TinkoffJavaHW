package edu.hw1;

public class Task7 {
    private Task7() {
    }

    private static int log2(int n) {
        int st = 0;
        int currentNum = n;
        while (currentNum != 0) {
            st++;
            currentNum /= 2;
        }
        return st;
    }

    public static int rotateLeft(int number, int shift) {
        int lenBinForm = log2(number);
        int ans = (number << shift) % (1 << lenBinForm);
        ans += number / (1 << (lenBinForm - shift));
        return ans;
    }

    public static int rotateRight(int number, int shift) {
        int lenBinForm = log2(number);
        int ans = (number >> shift);
        ans += ((number % (1 << shift)) << (lenBinForm - shift));
        return ans;
    }
}
