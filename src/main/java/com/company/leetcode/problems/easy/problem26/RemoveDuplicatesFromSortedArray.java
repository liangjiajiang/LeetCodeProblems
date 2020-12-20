package com.company.leetcode.problems.easy.problem26;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int result = 1;
        int truePosition = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[truePosition] != nums[i]) {
                nums[++truePosition] = nums[i];
                result++;
            }
        }
        return result;
    }

}
