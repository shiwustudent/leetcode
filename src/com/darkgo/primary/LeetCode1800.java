package com.darkgo.primary;

/**
 * <p>
 * 最大升序子数组和
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/7
 */
public class LeetCode1800 {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = i+1; j < n; j++) {
                if (nums[j] > nums[j - 1]) {
                    max += nums[j];
                }else {
                    break;
                }
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
