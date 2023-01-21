package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/21
 */
public class LeetCode1824 {
    public int minSideJumps(int[] obstacles) {
        int n = obstacles.length;
        int[][] dp = new int[n][3];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][1] = 0;
        dp[0][0] = dp[0][2] = 1;
        for (int i = 1; i < n; i++) {
            // 计算最小侧跳次数 minSum
            int minSum = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                if (j == obstacles[i] - 1) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else {
                    minSum = Math.min(minSum, dp[i - 1][j]);
                }
            }

            for (int j = 0; j < 3; j++) {
                if (j == obstacles[i] - 1) {
                    continue;
                } else {
                    dp[i][j] = Math.min(minSum + 1, dp[i - 1][j]);
                }
            }
        }
        return Math.min(dp[n - 1][1], Math.min(dp[n - 1][0], dp[n - 1][2]));
    }
}
