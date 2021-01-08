package com.company.leetcode.problems.easy.problem28;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        for (int hsCharCounter = 0; hsCharCounter < haystack.length(); hsCharCounter++){
            if (haystack.charAt(hsCharCounter) == needle.charAt(0)) {
                if (checkMatch(haystack, needle, hsCharCounter)) {
                    return hsCharCounter;
                }
            }
        }

        return -1;

    }

    public static boolean checkMatch(String haystack, String needle, int hsCharCounter) {
        for (int nCharCounter = 0; nCharCounter < needle.length(); nCharCounter++){
            try {
                if (haystack.charAt(hsCharCounter++) != needle.charAt(nCharCounter)) {
                    return false;
                }
            } catch (StringIndexOutOfBoundsException exception) {
                return false;
            }

        }
        return true;
    }

}
