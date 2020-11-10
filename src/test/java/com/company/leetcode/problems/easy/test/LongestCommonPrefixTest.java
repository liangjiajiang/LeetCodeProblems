package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.easy.problem14.LongestCommonPrefix;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {


    @Test
    public void reverseIntegerTest() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{}));
    }
}
