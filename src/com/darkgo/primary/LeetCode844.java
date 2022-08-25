package com.darkgo.primary;

/**
 * <p>
 * 比较含退格的字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/19
 */
public class LeetCode844 {
    private boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        build(s, sb);
        build(t, tb);
        return sb.toString().equals(tb.toString());
    }

    private void build(String t, StringBuilder tb) {
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (tb.length() > 0) {
                    tb.deleteCharAt(tb.length() - 1);
                }
            } else {
                tb.append(c);
            }
        }
    }
}
