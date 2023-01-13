package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/13
 */
public class LeetCode2287 {
    public int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : target.toCharArray()) {
            map.put(c - 'a', map.getOrDefault(c - 'a', 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (chars[key] / value < ans) {
                ans = chars[key] / value;
            }
        }
        return ans;
    }
}
