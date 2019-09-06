package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSumBruteWhenThereExistAndAnswerThenReturnTheTwoPositionOfTheAnswer(){
        Assert.assertArrayEquals("Basic target is 3", TwoSum.twoSumBrute(new int[]{1,2,3,4,5},3), new int[]{0,1});
        Assert.assertArrayEquals("Basic target is 9", TwoSum.twoSumBrute(new int[]{1,2,3,4,5},9), new int[]{3,4});
        Assert.assertArrayEquals("Complex should not count 3 twice as the answer", TwoSum.twoSumBrute(new int[]{1,7,3,4,5},6), new int[]{0,4});
        Assert.assertArrayEquals("Complex should not have any answer", TwoSum.twoSumBrute(new int[]{1,2,3,4,5},11),new int[]{-1});
    }

    @Test
    public void testTwoSumComplexWhenThereExistAndAnswerThenReturnTheTwoPositionOfTheAnswer(){
        Assert.assertArrayEquals("Basic target is 3", TwoSum.twoSumComplex(new int[]{1,2,3,4,5},3), new int[]{0,1});
        Assert.assertArrayEquals("Basic target is 9", TwoSum.twoSumComplex(new int[]{1,2,3,4,5},9), new int[]{3,4});
        Assert.assertArrayEquals("Complex should not count 3 twice as the answer", TwoSum.twoSumComplex(new int[]{1,7,3,4,5},6), new int[]{0,4});
        Assert.assertArrayEquals("Complex should not have any answer", TwoSum.twoSumComplex(new int[]{1,2,3,4,5},11),new int[]{-1});
    }
}
