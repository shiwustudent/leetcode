package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 最长回文串
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/13
 */
public class LeetCode409 {
    public static void main(String[] args) {

    }

    private int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            ans += value % 2 == 0 ? value : value - 1;
        }
        return ans == chars.length ? ans : ans + 1;
    }
}
