package com.darkgo.primary;

/**
 * <p>
 * 将字符串翻转到单调递增
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/11
 */
public class LeetCode926 {
    public static void main(String[] args) {

    }

    private int minFlipsMonoIncr(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[][] dp = new int[n + 1][2];
        dp[0][0] = chars[0] == '0' ? 0 : 1;
        dp[0][1] = 0;
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = dp[i - 1][0] + (chars[i] == '1' ? 1 : 0);
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + (chars[i] == '0' ? 1 : 0);
        }

        return Math.min(dp[n][0], dp[n][1]);
    }
}
