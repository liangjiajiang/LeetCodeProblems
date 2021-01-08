package com.company.leetcode.problems.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.company.leetcode.problems.medium.problem15.ThreeSum;

import org.junit.jupiter.api.Test;

public class ThreeSumTest {
    // add a + b + c = 0;
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> aResult1 = Arrays.asList(-1, 1, 0);
        List<Integer> aResult2 = Arrays.asList(-1, -1, 2);
        expectedResult.add(aResult1);
        expectedResult.add(aResult2);
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        assertEquals( expectedResult, ThreeSum.threeSum(input));
    }

    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers2() {
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> aResult1 = Arrays.asList(0, 0, 0);
        expectedResult.add(aResult1);
        int[] input = new int[]{0, 0, 0, 0, 0, 0};
        assertEquals( expectedResult, ThreeSum.threeSum(input));
    }

    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers3() {
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> aResult1 = Arrays.asList(-2, 0, 2);
        expectedResult.add(aResult1);
        int[] input = new int[]{-2, 0, 0, 2, 2};
        assertEquals( expectedResult, ThreeSum.threeSum(input));
    }

    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers4() {
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> aResult1 = Arrays.asList(1, 0, -1);
        expectedResult.add(aResult1);
        int[] input = new int[]{1, 0, -1};
        assertEquals( expectedResult, ThreeSum.threeSum(input));
    }

    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers5() {
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> aResult1 = Arrays.asList(-2, 0, 2);
        List<Integer> aResult2 = Arrays.asList(-2, 1, 1);
        expectedResult.add(aResult1);
        expectedResult.add(aResult2);
        int[] input = new int[]{-2, 0, 1, 1, 2};
        assertEquals( expectedResult, ThreeSum.threeSum(input));
    }




}
