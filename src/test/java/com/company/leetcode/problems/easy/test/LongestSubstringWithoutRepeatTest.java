package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.medium.problem3.LongestSubstringWithoutRepeat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatTest {
    @Test
    public void testLongestSubstringWhenWholeStringHasNoRepeatThenAnswerShouldBeWholeString() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubstring("abcdef"),
        6, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenARepeatExistThenAnswerShouldReturnLongestSubstringWithoutRepeat() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubstring("abcabcbb"), 3, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOnlyOneLetterThenAnswerShouldBeJustOne() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubstring("bbbbb"), 1, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasNoOtherLetterBetweenARepeatAnswerShouldBeWholeStringLengthFromLastOccurrence() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubstring("pwwkew"), 3, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOtherLetterBetweenARepectThenAnswerShouldBeWholeStringAndInBetweenRepeat() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubstring("dvdf"), 3, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasNoRepeatThenAnswerShouldBeWholeStringSecondWay() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("abcdef"), 6, "Answer should be string length" );
    }

    @Test
    public void testLongestSubstringWhenARepeatExistThenAnswerShouldReturnLongestSubstringWithoutRepeatSecondWay() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("abcabcbb"), 3, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOnlyOneLetterThenAnswerShouldBeJustOneSecondWay() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("bbbbb"), 1, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasNoOtherLetterBetweenARepeatAnswerShouldBeWholeStringLengthFromLastOccurrenceSecondWay() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("pwwkew"), 3, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasOtherLetterBetweenARepectThenAnswerShouldBeWholeStringAndInBetweenRepeatSecondWay() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("dvdf"), 3, "Answer should be string length");
    }

    @Test
    public void testLongestSubstringWhenWholeStringHasLargestStringExistBeforeRepectThenAnswerShouldBeWholeStringBeforeRepeatSecondWay() {
        Assertions.assertEquals(LongestSubstringWithoutRepeat.lengthOfLongestSubStringIteration3("cdd"), 2, "Answer should be string length");
    }

}
