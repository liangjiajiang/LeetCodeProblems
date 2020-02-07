package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.ReverseInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {


    @Test
    public void reverseIntegerTest() {
        assertEquals(4321, ReverseInteger.bruteForceReverse(1234));
        assertEquals(-4321, ReverseInteger.bruteForceReverse(-1234));
        assertEquals(0, ReverseInteger.bruteForceReverse(1234567899));
    }
}
