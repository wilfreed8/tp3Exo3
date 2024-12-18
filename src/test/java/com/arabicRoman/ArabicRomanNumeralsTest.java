package com.arabicRoman;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArabicRomanNumeralsTest {
    ArabicRomanNumerals actual ;
    String expected;
     @BeforeEach
     public void setUp() {
        actual = new ArabicRomanNumerals();
     }
     @AfterEach
     void tearDown() {
         actual=null;
         expected=null;
     }
    @Test
    public void devrait_retourner_I() {
        //given
        String expected = "I";
        //when
        String actual_value= actual.convert(1);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_II() {
        //given
        String expected = "II";
        //when
        String actual_value= actual.convert(2);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }

    @Test
    public void devrait_retourner_III() {
        //given
        String expected = "III";
        //when
        String actual_value= actual.convert(3);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_IV() {
        //given
        String expected = "IV";
        //when
        String actual_value= actual.convert(4);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_V() {
        //given
        String expected = "V";
        //when
        String actual_value= actual.convert(5);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_VI() {
        //given
        String expected = "VI";
        //when
        String actual_value= actual.convert(6);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
}
