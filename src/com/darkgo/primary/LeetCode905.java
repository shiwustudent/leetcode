package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 按奇偶排序数组
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/4/28
 */
public class LeetCode905 {
    public static void main(String[] args) {
        // int[] nums = {3, 1, 2, 4};
        int[] nums = {2, 2, 4, 5,2};
        System.out.println(Arrays.toString(new Solution().sortArrayByParity(nums)));
    }

    static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    index++;
                }
            }
            return nums;
        }
    }
}
