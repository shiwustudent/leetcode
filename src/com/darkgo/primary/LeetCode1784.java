package com.darkgo.primary;

/**
 * <p>
 * 检查二进制字符串字段
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/3
 */
public class LeetCode1784 {
    private boolean checkOnesSegment(String s) {
        boolean flag = false;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '0') {
                flag = true;
            }
            if (flag && c == '1') {
                return false;
            }
        }
        return true;
    }
}
