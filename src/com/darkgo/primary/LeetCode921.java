package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 使括号有效的最少添加
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/4
 */
public class LeetCode921 {
    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char aChar : chars) {
            if (aChar == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        return stack.size();
    }
}
