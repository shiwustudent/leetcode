package com.darkgo.offer;

import java.util.*;

/**
 * <p>
 * 从尾到头打印链表
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/10
 */
public class Offer06 {

    public static void main(String[] args) {

    }

    private static int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(head.val);
        ListNode temp = head.next;
        while (temp != null) {
            deque.push(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[deque.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = deque.pop();
        }
        return ans;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
