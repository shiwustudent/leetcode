package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 环绕字符串中唯一的子字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/25
 */
public class LeetCode467 {
    public static void main(String[] args) {

    }

    public int findSubstringInWraproundString(String p) {
        int[] dp = new int[26];
        int k = 0;
        for (int i = 0; i < p.length(); i++) {
            if (i > 0 && p.charAt(i) - p.charAt(i - 1) == 1) {
                k++;
            } else {
                k=1;
            }
            dp[p.charAt(i) - 'a'] = Math.max(k, dp[p.charAt(i) - 'a']);
        }
        return Arrays.stream(dp).sum();
    }
}
