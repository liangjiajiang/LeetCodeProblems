package com.company.leetcode.problems.easy;

public class PalindromeNumber {


    public static boolean isPalindrome(int x) {
        String isPalindrome = String.valueOf(x);
        int start = 0;
        int end = isPalindrome.length() - 1;
        while (true) {
            if (start == end) {
                return true;
            } else if (start > end) {
                return true;
            } else if (isPalindrome.charAt(start) == isPalindrome.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
    }


}
