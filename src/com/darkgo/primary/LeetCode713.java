package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 乘积小于 K 的子数组
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/5
 */
public class LeetCode713 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        // int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        // int k = 19;
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = i; j < nums.length; j++) {
                sum *= nums[j];
                if (sum >= k) {
                    break;
                } else {
                    ans++;
                }
            }
        }
        return ans;
    }
}

