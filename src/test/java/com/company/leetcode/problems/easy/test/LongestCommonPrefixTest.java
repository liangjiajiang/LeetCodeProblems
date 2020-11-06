package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.LongestCommonPrefix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {


    @Test
    public void reverseIntegerTest() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{}));
    }
}
