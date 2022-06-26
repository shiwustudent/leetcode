package com.darkgo.primary;

/**
 * <p>
 * 判断子序列
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/26
 */
public class LeetCode392 {
    private boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==m;
    }
}
