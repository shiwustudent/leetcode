package com.darkgo.primary;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 环形链表
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/15
 */
public class LeetCode141 {
    public static void main(String[] args) {

    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    private boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
