package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 最少移动次数使数组元素相等 II
 * </p>
 * 考虑中位数的性质
 * @author ShiWu
 * @since 2022/5/19
 */
public class LeetCode462 {
    public static void main(String[] args) {
        System.out.println(minMoves2(new int[]{1, 0, 0, 8, 4}));
    }
    private static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long sum = Arrays.stream(nums).mapToLong(i -> i).sum();
        long l = sum / nums.length;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.abs(nums[i] - l);
        }
        return ans;
    }
}
