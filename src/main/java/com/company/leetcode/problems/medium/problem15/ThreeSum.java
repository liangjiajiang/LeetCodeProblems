package com.company.leetcode.problems.medium.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, HashMap<Integer, Boolean>> check23 = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!check23.containsKey(-nums[i])) {
                check23.put(-nums[i], new HashMap<>());
                for (Integer key : check23.keySet()) {
                    if (key != -nums[i]) {
                        if (!check23.get(key).containsKey(nums[i])) {
                            check23.get(key).put(key-nums[i], false);
                        } else if( !check23.get(key).get(nums[i])) {
                            check23.get(key).put(nums[i], true);
                            check23.get(key).put(key-nums[i], true);
                            check23.get(-nums[i]).put(-key, true);
                            check23.get(-nums[i]).put(key-nums[i], true);
                            check23.get(-(key-nums[i])).put(-key, true);
                            check23.get(-(key-nums[i])).put(nums[i], true);
                            List<Integer> aSet = Arrays.asList(-key, nums[i], key-nums[i]);
                            result.add(aSet);
                        }
                    }
                }
            } else {
                for (Integer key : check23.keySet()) {
                    if (!check23.get(key).containsKey(nums[i])) {
                        check23.get(key).put(key-nums[i], false);
                    } else if( !check23.get(key).get(nums[i])) {
                        check23.get(key).put(nums[i], true);
                        check23.get(key).put(key-nums[i], true);
                        check23.get(-nums[i]).put(-key, true);
                        check23.get(-nums[i]).put(key-nums[i], true);
                        check23.get(-(key-nums[i])).put(-key, true);
                        check23.get(-(key-nums[i])).put(nums[i], true);
                        List<Integer> aSet = Arrays.asList(-key, nums[i], key-nums[i]);
                        result.add(aSet);
                    }
                }

            }
        }

        return result;
    }
}
