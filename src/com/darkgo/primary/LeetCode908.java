package com.darkgo.primary;

/**
 * <p>
 * 最小差值 I
 * </p>
 *
 * @author ShiWu
 * @since 2022/4/30
 */
public class LeetCode908 {
    public static void main(String[] args) {
        // int[] nums = {1, 3, 6};
        int[] nums = {0,10};
        int k = 2;
        System.out.println(new Solution().smallestRangeI(nums, k));
    }

    static class Solution {
        public int smallestRangeI(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            int ans = 0;
            if (max - min > 2 * k) {
                ans = max - min - 2 * k;
            }
            return ans;
        }
    }
}
