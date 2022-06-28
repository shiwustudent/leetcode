package com.darkgo.primary;

import java.util.List;

/**
 * <p>
 * 反转链表
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/28
 */
public class LeetCode206 {

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;

    }
}
