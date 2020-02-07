package com.company.leetcode.problems.easy;

public class ReverseInteger {


    public static int bruteForceReverse(int x) {
        long result = 0;
        String toString = String.valueOf(Math.abs(x));
        for (int i = toString.length()-1; i >= 0; i--) {
            result += Math.pow(10, i) * (toString.charAt(i)-48);
        }

        return result > Integer.MAX_VALUE ? 0 : (int) (x > 0 ? result : -result);
    }


}
