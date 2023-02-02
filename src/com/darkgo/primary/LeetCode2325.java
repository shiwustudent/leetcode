package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/1
 */
public class LeetCode2325 {
    private String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char[] chars = key.toCharArray();
        char base = 'a';
        for (char c : chars) {
            if (c == ' ') {
                continue;
            }
            if (!map.containsKey(c)) {
                map.put(c, base++);
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] m = message.toCharArray();
        for (char c : m) {
            sb.append(map.getOrDefault(c, ' '));
        }
        return sb.toString();
    }
}
