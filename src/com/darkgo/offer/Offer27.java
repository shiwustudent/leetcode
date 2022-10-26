package com.darkgo.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/26
 */
public class Offer27 {

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

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!Objects.equals(list.get(left++), list.get(right--))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p2 = reverseList(slow.next);
        ListNode p1 = head;
        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = head;
        ListNode cur = pre;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = pre.next;
            cur = next;
        }
        return pre;
    }

}
