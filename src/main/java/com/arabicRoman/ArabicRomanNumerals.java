package com.arabicRoman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        int[] values = { 50,40,10,9,5, 4, 1};
        String[] symbols = {"L","XL","X","IX","V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (nbr >= values[i]) { // Tant que le nombre peut être réduit
                roman.append(symbols[i]);
                nbr -= values[i];
            }
        }

        return roman.toString();

    }
}
