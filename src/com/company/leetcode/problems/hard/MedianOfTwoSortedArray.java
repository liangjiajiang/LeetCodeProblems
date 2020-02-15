package com.company.leetcode.problems.hard;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arrayOneMin, arrayOneMax, arrayTwoMin, arrayTwoMax;
        boolean arrayOneDone, arrayTwoDone;
        arrayOneDone = nums1.length == 0;
        arrayTwoDone = nums2.length == 0;
        arrayOneMin = arrayTwoMin = 0;
        arrayOneMax = nums1.length - 1;
        arrayTwoMax = nums2.length - 1;
        while (arrayOneMax - arrayOneMin + 1 + arrayTwoMax - arrayTwoMin + 1 > 2) {
            if (arrayOneDone) {
                arrayTwoMin++;
                arrayTwoMax--;
            } else if (arrayTwoDone) {
                arrayOneMin++;
                arrayOneMax--;
            } else {
                if (nums1[arrayOneMin] > nums2[arrayTwoMin]) {
                    arrayTwoMin++;
                } else {
                    arrayOneMin++;
                }
                if (nums1[arrayOneMax] > nums2[arrayTwoMax]) {
                    arrayOneMax--;
                } else {
                    arrayTwoMax--;
                }
            }
            if (arrayOneMax < arrayOneMin) {
                arrayOneDone = true;
            }
            if (arrayTwoMax < arrayTwoMin) {
                arrayTwoDone = true;
            }
        }
        if (arrayOneDone) {
            return (nums2[arrayTwoMax] + nums2[arrayTwoMin]) / 2.0;
        } else if (arrayTwoDone) {
            return (nums1[arrayOneMax] + nums1[arrayOneMin]) / 2.0;
        } else {
            return (nums1[arrayOneMax] + nums2[arrayTwoMax]) / 2.0;
        }
    }
}
