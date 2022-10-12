package com.darkgo.primary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/12
 */
public class LeetCode817 {
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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        while (head != null) {
            int cur = head.val;
            if (set.contains(cur)) {
                while (head != null && set.contains(cur)) {
                    head = head.next;
                }
                ans++;
            } else {
                head = head.next;
            }
        }
        return ans;
    }
}
