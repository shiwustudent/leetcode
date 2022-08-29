package com.darkgo.primary;

/**
 * <p>
 * 重新排列数组
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/29
 */
public class LeetCode1470 {
    private int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int left = 0;
        for (int i = 0; i < n; i++) {
            ans[left + i] = nums[i];
            ans[left + i + 1] = nums[n + i];
            left += 2;
        }
        return ans;
    }
}
