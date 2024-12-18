package com.arabicRoman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArabicRomanNumeralsTest {

    @Test
    public void devrait_retourner_I() {
        //given
        String expected = "I";
        //when
        String actual= ArabicRomanNumerals.convert(1);
        //then
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_II() {
        //given
        String expected = "II";
        //when
        String actual= ArabicRomanNumerals.convert(2);
        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void devrait_retourner_III() {
        //given
        String expected = "I";
        //when
        String actual= ArabicRomanNumerals.convert(1);
        //then
        assertThat(actual).isEqualTo(expected);
    }
}
