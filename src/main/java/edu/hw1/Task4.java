package edu.hw1;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String input) {
        String fixedString = "";
        for (int position = 0; position < input.length(); position += 2) {
            if (position + 1 < input.length()) {
                fixedString += input.charAt(position + 1);
                fixedString += input.charAt(position);
            } else {
                fixedString += input.charAt(position);
            }
        }
        return fixedString;
    }
}
