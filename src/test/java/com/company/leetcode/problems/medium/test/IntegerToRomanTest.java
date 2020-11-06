package com.company.leetcode.problems.medium.test;

import com.company.leetcode.problems.medium.IntegerToRoman;
import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        Assert.assertEquals("Anything good", IntegerToRoman.intToRoman(3999), "MMMCMXCIX");
        Assert.assertEquals("Anything good", IntegerToRoman.intToRoman(3), "III");
        Assert.assertEquals("Anything good", IntegerToRoman.intToRoman(44), "XLIV");
    }

}

