package com.darkgo.primary;

/**
 * <p>
 * 删除排序链表中的重复元素
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/20
 */
public class LeetCode83 {
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        while (pre.next != null) {
            if (pre.val == pre.next.val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }
}
