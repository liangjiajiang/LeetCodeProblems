package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.easy.problem27.RemoveElement;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    @Test
    public void testRemoveDuplicatesFromSortedArrayThenAnswerShouldBeSubstringWithoutDuplication() {
        assertEquals(0, RemoveElement.removeElement(new int[]{3, 3}, 3), "Answer should be 2");
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayThenAnswerShouldBeSubstringWithoutDuplication1() {
        assertEquals(6, RemoveElement.removeElement(new int[]{0,1,2,2,3,0,4,4}, 2), "Answer should be 5");
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayThenAnswerShouldBeSubstringWithoutDuplication2() {
        assertEquals(2, RemoveElement.removeElement(new int[]{5, 5}, 3), "Answer should be 2");
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayThenAnswerShouldBeSubstringWithoutDuplication3() {
        assertEquals(0, RemoveElement.removeElement(new int[]{3, 3}, 3), "Answer should be 2");
    }
}
