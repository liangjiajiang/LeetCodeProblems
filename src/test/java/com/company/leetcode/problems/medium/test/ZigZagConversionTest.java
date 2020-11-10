package com.company.leetcode.problems.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.medium.problem6.ZigZagConversion;

import org.junit.jupiter.api.Test;


public class ZigZagConversionTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        assertEquals(ZigZagConversion.convert("paypalishiring", 3), "pahnaplsiigyir");
        assertEquals(ZigZagConversion.convert("paypalishiring", 4), "pinalsigyahrpi");
        assertEquals(ZigZagConversion.convert("A", 1), "A");
    }



}

//p |a |y |p |a |l |i |s |h |i |r |i |n |g
//0 |1 |2 |3 |4 |5 |6 |7 |8 |9 |10|11|12|13
//    0|6 |12|1 |5 |7 |11|13|2 |4 |8 |10|3 |9       4 +6    (x-2)*2+2 = 6

