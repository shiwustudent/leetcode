package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 验证栈序列
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/31
 */
public class LeetCode946 {
    public static void main(String[] args) {
        int[] pushed = new int[]{0, 1};
        int[] popped = new int[]{1, 0};
        validateStackSequences(pushed, popped);
    }
    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = pushed.length;
        int start = 0, end = 0;
        while (start < n && end < n) {
            stack.push(pushed[start++]);
            while (!stack.isEmpty() && stack.peek() == popped[end]) {
                stack.pop();
                end++;
            }
        }
        return stack.isEmpty();
    }
}
