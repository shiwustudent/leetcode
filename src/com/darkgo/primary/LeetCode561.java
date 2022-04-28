package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 数组拆分 I
 * </p>
 * 数组排序，偶数下标相加
 * @author ShiWu
 * @since 2022/4/28
 */
public class LeetCode561 {
    public static void main(String[] args) {
        // int[] nums = {6, 2, 6, 5, 1, 2};
        int[] nums = {1,2,3,4};
        arrayPairSum(nums);
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans += nums[i];
            }
        }
        return ans;
    }
}
