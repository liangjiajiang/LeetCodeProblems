package com.company.leetcode.problems.hard;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arrayOneMin, arrayOneMax, arrayTwoMin, arrayTwoMax;
        boolean arrayOneDone, arrayTwoDone;
        arrayOneDone = arrayTwoDone = false;
        arrayOneMin = arrayTwoMin = 0;
        arrayOneMax = nums1.length-1;
        arrayTwoMax = nums2.length-1;
        while((arrayOneMax - arrayOneMin + arrayTwoMax - arrayTwoMin > 0)
                || (arrayOneDone && arrayTwoMax - arrayTwoMin > 1)
                || (arrayTwoDone && arrayOneMax - arrayOneMin > 1)) {
        }
        if(arrayOneMax - arrayOneMin + arrayTwoMax - arrayTwoMin == 0){
            return (nums1[arrayOneMin] + nums2[arrayTwoMin]) / 2.0;
        } else if (arrayOneDone && arrayTwoMax - arrayTwoMin > 1){
        }
        return 0;
    }
}
