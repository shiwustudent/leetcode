package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 同构字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/26
 */
public class LeetCode205 {
    public static void main(String[] args) {

    }

    private boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
