package com.company.leetcode.problems.easy.problem27;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int truePosition = 0;

        for (int outter = 0; outter < nums.length; outter++) {
            if (nums[outter] == val) {
                for(int inner = outter+1; inner < nums.length; inner++) {
                    if (nums[inner] != val) {
                        int temp = nums[outter];
                        nums[outter] = nums[inner];
                        nums[inner] = temp;
                        truePosition++;
                        break;
                    }
                }
                if (nums[outter] == val) {
                    break;
                }
            } else {
                truePosition++;
            }
        }

        return truePosition;
    }

}
