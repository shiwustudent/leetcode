package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/7
 */
public class LeetCode1658 {
    public static void main(String[] args) {

    }


    private int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        if (sum < x) {
            return -1;
        }
        int right = 0;
        int lSum = 0, rSum = sum;
        int ans = n + 1;
        for (int left = -1; left < n; left++) {
            if (left != -1) {
                lSum += nums[left];
            }
            while (right < n && lSum + rSum > x) {
                rSum -= nums[right];
                ++right;
            }
            if (lSum + rSum == x) {
                ans = Math.min(ans, (left + 1) + (n - right));
            }
        }
        return ans > n ? -1 : ans;
    }
}
