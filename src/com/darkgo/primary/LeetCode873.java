package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 最长的斐波那契子序列的长度
 * //TODO 补充另外几种方法解
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/9
 */
public class LeetCode873 {
    private int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> indices = new HashMap<>();
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            indices.put(arr[i], i);
        }
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0 && arr[j] * 2 > arr[i]; j--) {
                int k = indices.getOrDefault(arr[i] - arr[j], -1);
                if (k >= 0) {
                    dp[j][i] = Math.max(dp[k][j] + 1, 3);
                }
                ans = Math.max(ans, dp[j][i]);

            }
        }
        return ans;
    }
}
