package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 删除最外层的括号
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/28
 */
public class LeetCode1021 {
    public static void main(String[] args) {

    }

    private String removeOuterParentheses(String s) {
        // ArrayDeque<Character> stack = new ArrayDeque<>();
        Deque<Character> stack = new LinkedList<>();
        StringBuffer res = new StringBuffer();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == ')'){
                stack.pop();
            }
            if (!stack.isEmpty()) {
                res.append(aChar);
            }
            if (aChar == '(') {
                stack.push(aChar);
            }
        }
        return res.toString();
    }
}
