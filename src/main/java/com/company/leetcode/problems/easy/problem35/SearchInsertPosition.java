package com.company.leetcode.problems.easy.problem35;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && target < nums[i]) {
            i++;
        }
        
        return i;
    }

}
