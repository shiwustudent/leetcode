package com.darkgo.offer;

/**
 * <p>
 * 剑指 Offer 42. 连续子数组的最大和
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/3
 */
public class Offer42 {
    public static void main(String[] args) {

    }

    private int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            ans = Math.max(dp[i], ans);

        }
        return ans;
    }
}
