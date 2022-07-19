package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 寻找数组的中心下标
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/25
 */
public class LeetCode724 {
    public static void main(String[] args) {
        pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
    }

    private static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }
}
