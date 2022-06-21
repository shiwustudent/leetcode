package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 有效的括号
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/21
 */
public class LeetCode20 {
    public static void main(String[] args) {

    }
    private static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Deque<Character> stack = new LinkedList<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;

    }
}
