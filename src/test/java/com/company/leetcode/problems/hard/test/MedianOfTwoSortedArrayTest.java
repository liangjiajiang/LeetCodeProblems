package com.company.leetcode.problems.hard.test;

import com.company.leetcode.problems.hard.MedianOfTwoSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArrayTest {

    @Test
    public void testMedianOfTwoSortedArrayGivenTwoArrayThenReturnTheMedium() {
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0, 0);
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5, 0);
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8}), 4.5, 0);
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1}, new int[]{8}), 4.5, 0);
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1}, new int[]{}), 1, 0);

    }
}
