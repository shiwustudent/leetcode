package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/24
 */
public class LeetCode915 {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[n - 1] = nums[n - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            arr[i] = Math.min(nums[i], arr[i + 1]);
        }
        System.out.println(Arrays.toString(arr));
        int max = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i]);
            if (max < arr[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}
