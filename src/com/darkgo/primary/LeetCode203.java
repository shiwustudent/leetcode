package com.darkgo.primary;

import java.util.List;

/**
 * <p>
 * 移除链表元素
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/19
 */
public class LeetCode203 {
    public static void main(String[] args) {

    }

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

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public ListNode removeElements1(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode temp = node;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return node.next;
    }
}
