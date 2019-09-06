package com.company.leetcode.problems.medium;

import com.company.leetcode.problems.objects.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result, counter;
        result = counter = null;
        int remainder , val;
        remainder = val = 0;
        while(null != l1 || null != l2){
            if(null != l1 && null != l2){
                val = val + l1.val + l2.val + remainder;
                l2 = l2.next;
                l1 = l1.next;
            } else if (null != l1) {
                val = val + l1.val + remainder;
                l1 = l1.next;
            } else {
                val = val + l2.val + remainder;
                l2 = l2.next;
            }
            if(val >= 10){
                remainder = 1;
                val-=10;
            } else{
                remainder = 0;
            }
            if(result == null){
                counter = new ListNode(val);
                result = counter;
            } else {
                counter.setNext(new ListNode(val));
                counter = counter.getNext();
            }
            val = 0;
        }

        if(remainder != 0){
            counter.setNext(new ListNode(remainder));
        }
        return result;
    }
}
