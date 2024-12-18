package com.arabicRoman;

public class ArabicRomanNumerals {
    public static String convert(int i) {
        String result ="";
        if(i<=3)
        switch (i) {
            case 1: result = "I";
            break;
              case 2: result = "II";
              break;
                case 3: result = "III";
                break;
                default: result = "I";
        }

        else {
            result = "IV";
            if(i>4) result="V";
        }
        return result;
    }
}
