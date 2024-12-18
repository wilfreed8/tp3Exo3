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
    @Test
    public void devrait_retourner_VII() {
        //given
        String expected = "VII";
        //when
        String actual_value= actual.convert(7);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_VIII() {
        //given
        String expected = "VIII";
        //when
        String actual_value= actual.convert(8);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_IX() {
        //given
        String expected = "IX";
        //when
        String actual_value= actual.convert(9);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_X() {
        //given
        String expected = "X";
        //when
        String actual_value= actual.convert(10);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XI() {
        //given
        String expected = "XI";
        //when
        String actual_value= actual.convert(11);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XIV() {
        //given
        String expected = "XIV";
        //when
        String actual_value= actual.convert(14);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XV() {
        //given
        String expected = "XV";
        //when
        String actual_value= actual.convert(15);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XIX() {
        //given
        String expected = "XIX";
        //when
        String actual_value= actual.convert(19);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XX() {
        //given
        String expected = "XX";
        //when
        String actual_value= actual.convert(20);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XXX() {
        //given
        String expected = "XXX";
        //when
        String actual_value= actual.convert(30);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XL() {
        //given
        String expected = "XL";
        //when
        String actual_value= actual.convert(40);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_XLV() {
        //given
        String expected = "XLV";
        //when
        String actual_value= actual.convert(45);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_L() {
        //given
        String expected = "L";
        //when
        String actual_value= actual.convert(50);
        //then
        assertThat(actual_value).isEqualTo(expected);
    }

}
