package com.darkgo.primary;

import java.util.Arrays;

/**
 * 旋转函数396
 * 迭代法
 * 计算出数组旋转前的F(0)值和每次旋转的F(i)值，
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 */
public class LeetCode396 {
    public static void main(String[] args) {
//        int[] nums = {4, 3, 2, 6};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        maxRotateFunction(nums);
    }
    private static int maxRotateFunction(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int f = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            f += i * nums[i];
        }
        int ans = f;
        for (int i = 0; i < n - 1; i++) {
            f = f - sum + n * nums[i];
            ans = Math.max(f, ans);
        }
        return ans;
    }
}
