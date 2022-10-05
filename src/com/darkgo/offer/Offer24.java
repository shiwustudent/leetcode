package com.darkgo.offer;

import java.util.List;

/**
 * <p>
 * 反转链表
 * </p>
 * 迭代法
 * @author ShiWu
 * @since 2022/5/10
 */
public class Offer24 {
    public static void main(String[] args) {

    }

    private static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    private static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


        private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
