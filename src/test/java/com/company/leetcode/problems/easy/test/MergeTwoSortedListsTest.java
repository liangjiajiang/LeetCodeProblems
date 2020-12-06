package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.easy.problem21.MergeTwoSortedLists;
import com.company.leetcode.problems.objects.ListNode;

import org.junit.jupiter.api.Test;


public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoSortedListsBruteWhenThereExistAnAnswerThenReturnTheMergeList() {
        ListNode l1 = new ListNode(1).addToEnd(2).addToEnd(4);
        ListNode l2 = new ListNode(1).addToEnd(3).addToEnd(4);
        ListNode expectedResults = new ListNode(1).addToEnd(1).addToEnd(2).addToEnd(3).addToEnd(4).addToEnd(4);

        assertEquals(expectedResults, MergeTwoSortedLists.mergeTwoSortedList(l1, l2), "Array not sorted");
    }


}
