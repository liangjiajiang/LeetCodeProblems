package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.LongestSubstringWithoutRepeat;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatTest {
    @Test
    public void testLongestSubstringWhenWholeStringHasNoRepeatThenAnswerShouldBeWholeString() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubstring("abcdef"), 6);
    }

    @Test
    public void testLongestSubstringWhenARepeatExistThenAnswerShouldReturnLongestSubstringWithoutRepeat() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubstring("abcabcbb"), 3);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOnlyOneLetterThenAnswerShouldBeJustOne() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubstring("bbbbb"), 1);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasNoOtherLetterBetweenARepeatAnswerShouldBeWholeStringLengthFromLastOccurrence() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubstring("pwwkew"), 3);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOtherLetterBetweenARepectThenAnswerShouldBeWholeStringAndInBetweenRepeat() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubstring("dvdf"), 3);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasNoRepeatThenAnswerShouldBeWholeStringSecondWay() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("abcdef"), 6);
    }

    @Test
    public void testLongestSubstringWhenARepeatExistThenAnswerShouldReturnLongestSubstringWithoutRepeatSecondWay() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("abcabcbb"), 3);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOnlyOneLetterThenAnswerShouldBeJustOneSecondWay() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("bbbbb"), 1);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasNoOtherLetterBetweenARepeatAnswerShouldBeWholeStringLengthFromLastOccurrenceSecondWay() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("pwwkew"), 3);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOtherLetterBetweenARepectThenAnswerShouldBeWholeStringAndInBetweenRepeatSecondWay() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("dvdf"), 3);
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasLargestStringExistBeforeRepectThenAnswerShouldBeWholeStringBeforeRepeatSecondWay() {
        Assert.assertEquals("Answer should be string length", LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("cdd"), 2);
    }

}
