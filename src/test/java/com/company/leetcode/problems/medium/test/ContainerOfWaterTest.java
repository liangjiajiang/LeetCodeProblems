package com.company.leetcode.problems.medium.test;

import com.company.leetcode.problems.medium.ContainerOfWater;
import org.junit.Assert;
import org.junit.Test;

public class ContainerOfWaterTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        Assert.assertEquals("Anything good", ContainerOfWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assert.assertEquals("Anything good", ContainerOfWater.maxArea(new int[]{1, 7, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assert.assertEquals("Anything good", ContainerOfWater.maxArea(new int[]{1, 8, 6, 2, 100, 100, 8, 3, 7}), 100);
    }

}

