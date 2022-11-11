package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/11
 */
public class LeetCode1704 {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        char[] u = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < chars.length; i++) {
            for (char c : u) {
                if (chars[i] == c && i < chars.length / 2) {
                    start++;
                } else if (chars[i] == c && i >= chars.length / 2) {
                    end++;
                }
            }
        }
        return start == end;
    }
}
