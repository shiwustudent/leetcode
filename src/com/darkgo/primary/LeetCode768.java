package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 最多能完成排序的块 II
 * </p>
 *  //TODO 另一种解法
 * @author ShiWu
 * @since 2022/8/13
 */
public class LeetCode768 {
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i : arr) {
            if (stack.isEmpty() || i >= stack.peek()) {
                stack.push(i);
            } else {
                int mx = stack.pop();
                while (!stack.isEmpty() && stack.peek() > i) {
                    stack.pop();
                }
                stack.push(mx);
            }
        }
        return stack.size();
    }
}
