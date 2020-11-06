package com.company.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    return new int[]{i, y};
                }
            }
        }
        return new int[]{-1};
    }

    public static int[] twoSumComplex(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (resultMap.containsKey(nums[i])) {
                return new int[]{resultMap.get(nums[i]), i};
            } else {
                resultMap.put(target - nums[i], i);
            }
        }
        return new int[]{-1};
    }

}
