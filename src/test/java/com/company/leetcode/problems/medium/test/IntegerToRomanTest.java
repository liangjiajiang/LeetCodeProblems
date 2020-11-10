package com.company.leetcode.problems.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.medium.IntegerToRoman;

import org.junit.jupiter.api.Test;


public class IntegerToRomanTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        assertEquals(IntegerToRoman.intToRoman(3999), "MMMCMXCIX", "Anything good");
        assertEquals(IntegerToRoman.intToRoman(3), "III", "Anything good");
        assertEquals(IntegerToRoman.intToRoman(44), "XLIV", "Anything good");
    }

}

