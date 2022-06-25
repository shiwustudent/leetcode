package com.darkgo.primary;

/**
 * <p>
 * 一维数组的动态和
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/25
 */
public class LeetCode1480 {
    private int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
