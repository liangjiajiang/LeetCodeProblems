package com.company.leetcode.problems.objects;

import java.util.Objects;

/**
 * Basic Node Data Structure.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode addToEnd(int valToAdd) {
        ListNode counter = this;
        while (counter.getNext() != null){
            counter = counter.getNext();
        }
        counter.setNext(new ListNode(valToAdd));
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    public void display(){
        ListNode counter = this;
        while (counter != null){
            System.out.print(counter.val + " ");
            counter = counter.getNext();
        }
        System.out.println();
    }
}
