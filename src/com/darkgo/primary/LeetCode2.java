package com.darkgo.primary;

/**
 * <p>
 * 两数相加
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/9
 */
public class LeetCode2 {
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

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), tail = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            tail = new ListNode(sum % 10);
            tail = tail.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return head.next;
    }
}
