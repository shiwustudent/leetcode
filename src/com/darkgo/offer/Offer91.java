package com.darkgo.offer;

import java.util.Arrays;
import java.util.Map;

/**
 * <p>
 * 粉刷房子
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/25
 */
public class Offer91 {
    private int minCost(int[][] costs) {
        int[] dp = new int[3];
        int n = costs.length;
        for (int i = 0; i < 3; i++) {
            dp[i] = costs[0][i];
        }
        for (int i = 1; i < n; i++) {
            int[] dpNew = new int[3];
            for (int j = 0; j < 3; j++) {
                dpNew[j] = Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + costs[i][j];
            }
            dp = dpNew;
        }
        return Arrays.stream(dp).min().getAsInt();
    }

    private int minCost1(int[][] costs) {
        int n = costs.length;
        for (int i = 1; i < n; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][1], costs[i - 1][0]);
        }
        return Math.min(costs[n - 1][2], Math.min(costs[n - 1][0], costs[n - 1][1]));
    }
}
