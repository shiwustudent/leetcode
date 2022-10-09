package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 括号的分数
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/9
 */
public class LeetCode856 {

    //stack
    private int scoreOfParentheses(String s) {
        char[] chars = s.toCharArray();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int top = stack.pop() + Math.max(2 * v, 1);
                stack.push(top);
            }
        }
        return stack.peek();
    }

    //分治
    private int scoreOfParentheses1(String s) {
        if (s.length() == 2) {
            return 1;
        }
        int n = s.length(), balance = 0, len = 0;
        for (int i = 0; i < n; i++) {
            balance += s.charAt(i) == '(' ? -1 : 1;
            if (balance == 0) {
                len = i + 1;
            }
        }
        if (n == len) {
            return 2 * scoreOfParentheses(s.substring(1, s.length() - 1));
        } else {
            return scoreOfParentheses(s.substring(0, len)) + scoreOfParentheses(s.substring(len));
        }
    }
}
