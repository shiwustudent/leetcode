package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 找出第 K 小的数对距离
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/15
 */
public class LeetCode719 {
    public static void main(String[] args) {

    }

    private int smallestDistancePair(int[] nums, int k) {
        int[] dp = new int[(int) (1e6 + 1)];
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int m = nums[j] - nums[i];
                dp[m]++;
            }
        }
        int count = 0;
        for (int i = 0; i < dp.length; i++) {
            while (dp[i] != 0) {
                dp[i]--;
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return 0;
    }
}
