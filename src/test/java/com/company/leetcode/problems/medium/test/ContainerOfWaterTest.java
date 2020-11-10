package com.company.leetcode.problems.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.medium.problem11.ContainerOfWater;

import org.junit.jupiter.api.Test;

public class ContainerOfWaterTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        assertEquals(ContainerOfWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49, "Anything good");
        assertEquals(ContainerOfWater.maxArea(new int[]{1, 7, 6, 2, 5, 4, 8, 3, 7}), 49, "Anything good");
        assertEquals(ContainerOfWater.maxArea(new int[]{1, 8, 6, 2, 100, 100, 8, 3, 7}), 100, "Anything good");
    }

}

