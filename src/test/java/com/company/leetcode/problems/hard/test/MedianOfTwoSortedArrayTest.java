package com.company.leetcode.problems.hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.hard.problem4.MedianOfTwoSortedArray;

import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArrayTest {

    @Test
    public void testMedianOfTwoSortedArrayGivenTwoArrayThenReturnTheMedium() {
        assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0, 0);
        assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5, 0);
        assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8}), 4.5, 0);
        assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1}, new int[]{8}), 4.5, 0);
        assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1}, new int[]{}), 1, 0);

    }
}
