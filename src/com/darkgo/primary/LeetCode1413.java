package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 逐步求和得到正数的最小值
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/9
 */
public class LeetCode1413 {
    private int minStartValue(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
            min = Math.min(min, nums[i]);
        }
        return min > 0 ? 1 : Math.abs(min) + 1;
    }

    private int minStartValue2(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        if (min >= 0) {
            return 1;
        }
        int left = 1, right = -min * nums.length + 1;
        while (left < right) {
            int medium = (left + right) / 2;
            if (valid(medium, nums)) {
                right = medium;
            } else {
                left = medium + 1;
            }
        }
        return left;
    }

    private boolean valid(int startValue, int[] nums) {
        for (int num : nums) {
            startValue += num;
            if (startValue <= 0) {
                return false;
            }
        }
        return true;
    }

}
