package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/11
 */
public class LeetCode2283 {
    public static void main(String[] args) {
        digitCount("1210");
    }

    private static boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            int i = c - '0';
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (map.getOrDefault(i, 0) != num.charAt(i) - '0') {
                return false;
            }
        }
        return true;
    }
}
