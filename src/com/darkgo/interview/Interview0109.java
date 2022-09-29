package com.darkgo.interview;

/**
 * <p>
 * 字符串轮转
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/29
 */
public class Interview0109 {
    private boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s1.charAt(i + j) % n != s2.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    private boolean isFlipedString1(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s2).contains(s2);
    }
}
