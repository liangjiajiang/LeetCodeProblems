package com.company.leetcode.problems.medium.test;

import com.company.leetcode.problems.objects.ListNode;
import com.company.leetcode.problems.medium.AddTwoNumbers;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumberWhenBothListAreEqualThenReturnSumOfAnswers() {
        ListNode l1 = new ListNode(2).addToEnd(4).addToEnd(3);
        ListNode l2 = new ListNode(5).addToEnd(6).addToEnd(4);
        ListNode result = new ListNode(7).addToEnd(0).addToEnd(8);
        AddTwoNumbers.addTwoNumbers(l1, l2).display();
        Assert.assertEquals("Basic case equal number of nodes", AddTwoNumbers.addTwoNumbers(l1, l2), result);
    }

    @Test
    public void testAddTwoNumberWhenBothListL1IsLargerThenReturnSumOfAnswers() {
        ListNode l1 = new ListNode(2).addToEnd(4).addToEnd(3).addToEnd(6);
        ListNode l2 = new ListNode(5).addToEnd(6).addToEnd(4);
        ListNode result2 = new ListNode(7).addToEnd(0).addToEnd(8).addToEnd(6);
        AddTwoNumbers.addTwoNumbers(l1, l2).display();
        Assert.assertEquals("Basic case l1 has more nodes", AddTwoNumbers.addTwoNumbers(l1, l2), result2);
    }

    @Test
    public void testAddTwoNumberWhenBothListL2IsLargerThenReturnSumOfAnswers() {
        ListNode l1 = new ListNode(2).addToEnd(4).addToEnd(3);
        ListNode l2 = new ListNode(5).addToEnd(6).addToEnd(4).addToEnd(6);
        ListNode result3 = new ListNode(7).addToEnd(0).addToEnd(8).addToEnd(6);
        AddTwoNumbers.addTwoNumbers(l1, l2).display();
        Assert.assertEquals("basic case l2 has more nodes", AddTwoNumbers.addTwoNumbers(l1, l2), result3);
    }

    @Test
    public void testAddTwoNumberWhenLastValueHasARemainderThenReturnSumOfAnswers() {
        ListNode l1 = new ListNode(5).addToEnd(4).addToEnd(5);
        ListNode l2 = new ListNode(5).addToEnd(6).addToEnd(4);
        ListNode result4 = new ListNode(0).addToEnd(1).addToEnd(0).addToEnd(1);
        AddTwoNumbers.addTwoNumbers(l1, l2).display();
        Assert.assertEquals("Complex equal nodes but has carry over", AddTwoNumbers.addTwoNumbers(l1, l2), result4);
    }

    @Test
    public void testAddTwoNumberWhenL1HasConstantOverFlowThenReturnSumOfAnswers() {
        ListNode l1 = new ListNode(5).addToEnd(4).addToEnd(5).addToEnd(9).addToEnd(9);
        ListNode l2 = new ListNode(5).addToEnd(6).addToEnd(4);
        ListNode result5 = new ListNode(0).addToEnd(1).addToEnd(0).addToEnd(0).addToEnd(0).addToEnd(1);
        AddTwoNumbers.addTwoNumbers(l1, l2).display();
        Assert.assertEquals("Complex infinite carry over", AddTwoNumbers.addTwoNumbers(l1, l2), result5);
    }

    @Test
    public void testAddTwoNumberWhenL2IsLongerButHasOverFlowFromL1ThenReturnSumOfAnswers() {
        ListNode l1 = new ListNode(8).addToEnd(6);
        ListNode l2 = new ListNode(6).addToEnd(4).addToEnd(9);
        ListNode result6 = new ListNode(4).addToEnd(1).addToEnd(0).addToEnd(1);
        AddTwoNumbers.addTwoNumbers(l1, l2).display();
        Assert.assertEquals("Complex infinite carry over", AddTwoNumbers.addTwoNumbers(l1, l2), result6);
    }

}

