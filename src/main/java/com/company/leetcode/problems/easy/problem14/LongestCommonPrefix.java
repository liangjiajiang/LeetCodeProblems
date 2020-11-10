package com.company.leetcode.problems.easy.Problem14;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (String string : strs) {
            prefix = findPrefix(string, prefix);
        }
        return prefix;
    }

    private static String findPrefix(String string, String prefix) {
        while (!prefix.isEmpty()) {
            if (string.startsWith(prefix)) {
                return prefix;
            } else {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }


}
