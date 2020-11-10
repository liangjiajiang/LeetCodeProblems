package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.company.leetcode.problems.easy.TwoSum;

import org.junit.jupiter.api.Test;


public class TwoSumTest {

    @Test
    public void testTwoSumBruteWhenThereExistAndAnswerThenReturnTheTwoPositionOfTheAnswer() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSumBrute(new int[]{1, 2, 3, 4, 5}, 3), "Basic target is 3");
        assertArrayEquals(new int[]{3, 4}, TwoSum.twoSumBrute(new int[]{1, 2, 3, 4, 5}, 9), "Basic target is 9");
        assertArrayEquals(new int[]{0, 4}, TwoSum.twoSumBrute(new int[]{1, 7, 3, 4, 5}, 6), "Complex should not count 3 twice as the answer");
        assertArrayEquals(new int[]{-1}, TwoSum.twoSumBrute(new int[]{1, 2, 3, 4, 5}, 11), "Complex should not have any answer");
    }

    @Test
    public void testTwoSumComplexWhenThereExistAndAnswerThenReturnTheTwoPositionOfTheAnswer() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSumComplex(new int[]{1, 2, 3, 4, 5}, 3), "Basic target is 3");
        assertArrayEquals(new int[]{3, 4}, TwoSum.twoSumComplex(new int[]{1, 2, 3, 4, 5}, 9), "Basic target is 9");
        assertArrayEquals(new int[]{0, 4}, TwoSum.twoSumComplex(new int[]{1, 7, 3, 4, 5}, 6), "Complex should not count 3 twice as the answer");
        assertArrayEquals(new int[]{-1}, TwoSum.twoSumComplex(new int[]{1, 2, 3, 4, 5}, 11), "Complex should not have any answer");
    }
}
