package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/30
 */
public class LeetCode876 {
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

    //单指针
    private ListNode middleNode1(ListNode head) {
        int cnt = 0;
        ListNode cur = head;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }
        cnt = cnt / 2;
        cur = head;
        while (cnt > 0) {
            cnt--;
            cur = cur.next;
        }
        return cur;
    }

    //    数组
    private ListNode middleNode2(ListNode head) {
        ListNode[] A = new ListNode[100];
        int cnt = 0;
        while (head != null) {
            A[cnt++] = head;
            head = head.next;
        }
        return A[cnt / 2];
    }

    //快慢指针
    private ListNode middleNode3(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
