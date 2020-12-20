package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.easy.problem26.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testRemoveDuplicatesFromSortedArrayThenAnswerShouldBeSubstringWithoutDuplication() {
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}), "Answer should be 2");
    }

}
