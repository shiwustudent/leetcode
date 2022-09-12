package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 特殊数组的特征值
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/12
 */
public class LeetCode1608 {
    public int specialArray(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j]>= i) {
                    count++;
                }
            }
            if (count == i) {
                return count;
            }
        }
        return -1;
    }
}
