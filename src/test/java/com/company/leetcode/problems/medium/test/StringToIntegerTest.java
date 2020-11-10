package com.company.leetcode.problems.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.medium.problem8.StringToInteger;

import org.junit.jupiter.api.Test;

public class StringToIntegerTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        assertEquals( StringToInteger.myAtoi(""), 0);
        assertEquals(StringToInteger.myAtoi("-"), 0);
        assertEquals(StringToInteger.myAtoi("+1"), 1);
        assertEquals(StringToInteger.myAtoi("00000000000000000001231"), 1231);
        assertEquals(StringToInteger.myAtoi("21"), 21);
        assertEquals(StringToInteger.myAtoi("-21"), -21);
        assertEquals(StringToInteger.myAtoi("2121 saklj"), 2121);
        assertEquals(StringToInteger.myAtoi("sak 21"), 0);
        assertEquals(StringToInteger.myAtoi("921301201901301"), Integer.MAX_VALUE);
        assertEquals(StringToInteger.myAtoi("-921301201901301"), Integer.MIN_VALUE);

    }



}
