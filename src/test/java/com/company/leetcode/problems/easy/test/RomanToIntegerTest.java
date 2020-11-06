package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.RomanToInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {


    @Test
    public void reverseIntegerTest() {
        assertEquals(3, RomanToInteger.romanToInt("III"));
        assertEquals(4, RomanToInteger.romanToInt("IV"));
        assertEquals(9, RomanToInteger.romanToInt("IX"));
        assertEquals(58, RomanToInteger.romanToInt("LVIII"));
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }
}
