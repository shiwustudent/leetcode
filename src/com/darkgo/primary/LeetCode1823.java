package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 找出游戏的获胜者
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/4
 */
public class LeetCode1823 {
    public static void main(String[] args) {
        // int n = 5, k = 2;
        int n = 6, k = 5;
        System.out.println(findTheWinner(n, k));
    }

    private static int findTheWinner(int n, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        while (deque.size() > 1) {
            for (int i = 1; i < k; i++) {
                Integer poll = deque.poll();
                deque.offer(poll);
            }
            deque.poll();
        }
        return deque.peek();
    }
}
