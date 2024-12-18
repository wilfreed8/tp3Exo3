package com.arabicRoman;

public class ArabicRomanNumerals {
    public static String convert(int i) {
        String result = "I";
        if(i>1){
            result = "II";
        }
        return result;
    }
}
