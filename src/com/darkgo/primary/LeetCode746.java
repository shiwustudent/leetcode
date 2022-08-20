package com.darkgo.primary;

/**
 * <p>
 * 使用最小花费爬楼梯
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/19
 */
public class LeetCode746 {
    private int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
