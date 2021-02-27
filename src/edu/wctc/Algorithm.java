package edu.wctc;

public class Algorithm {
    public static String createSoundex(String s) {
        char[] x = s.toUpperCase().toCharArray();
        char firstLetter = x[0];

        for (int i = 0; i < x.length; i++) {
            switch (x[i]) {
                case 'B', 'F', 'P', 'V' -> x[i] = '1';
                case 'C', 'G', 'J', 'K', 'Q', 'S', 'X', 'Z' -> x[i] = '2';
                case 'D', 'T' -> x[i] = '3';
                case 'L' -> x[i] = '4';
                case 'M', 'N' -> x[i] = '5';
                case 'R' -> x[i] = '6';
                default -> x[i] = '0';
            }
        }

        String output = "" + firstLetter;
        for (int i = 1; i < x.length; i++)
            if (x[i] != x[i - 1] && x[i] != '0')
                output += x[i];

        output = output + "0000";
        return output.substring(0, 4);
    }
}
