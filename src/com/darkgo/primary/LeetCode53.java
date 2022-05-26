package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 最大子数组和
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/26
 */
public class LeetCode53 {
    public static void main(String[] args) {

    }

    private int maxSubArray(int[] nums) {
        int pre = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            max = Math.max(pre, max);
        }
        return max;
    }
}
