package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 * 最长数对链
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/3
 */
public class LeetCode646 {

    //Sort + Greedy
    private int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int res = 0;
        int n = pairs.length;
        int[] temp = pairs[0];
        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > temp[1]) {
                res++;
                temp = pairs[i];
            }
        }
        return res;
    }

    // Sort + dp
    private int findLongestChain1(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (pairs[i][1] < pairs[j][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}
