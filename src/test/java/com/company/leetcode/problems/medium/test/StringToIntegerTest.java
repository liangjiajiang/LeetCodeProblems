package com.company.leetcode.problems.medium.test;

import com.company.leetcode.problems.medium.StringToInteger;
import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        Assert.assertEquals("Anything good", StringToInteger.myAtoi(""), 0);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("-"), 0);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("+1"), 1);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("00000000000000000001231"), 1231);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("21"), 21);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("-21"), -21);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("2121 saklj"), 2121);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("sak 21"), 0);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("921301201901301"), Integer.MAX_VALUE);
        Assert.assertEquals("Anything good", StringToInteger.myAtoi("-921301201901301"), Integer.MIN_VALUE);

    }



}
