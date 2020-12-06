package com.company.leetcode.problems.easy.problem21;

import com.company.leetcode.problems.objects.ListNode;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        
        ListNode current = new ListNode();
        ListNode result = current;
        
        while(l1 != null && l2 !=null){
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if(l1 == null && l2 !=null) current.next = l2;
        if(l2 == null && l1 !=null) current.next = l1;

        return result.next;
    }

}
