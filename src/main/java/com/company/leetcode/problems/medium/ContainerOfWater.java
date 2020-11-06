package com.company.leetcode.problems.medium;

public class ContainerOfWater {

    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int shortest = height[0];
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                if (shortest == height[i]) {
                    shortest = Math.min(height[i], height[j]);
                    if (shortest == height[i]) {
                        if (shortest * (j - i) > maxArea) {
                            maxArea = shortest * (j - i);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        if (shortest * (j - i) > maxArea) {
                            maxArea = shortest * (j - i);
                        }
                    }
                } else {
                    shortest = Math.min(height[i], height[j]);
                    if (shortest * (j - i) > maxArea) {
                        maxArea = shortest * (j - i);
                    }
                }
            }
        }
        return maxArea;
    }

}
