package com.darkgo.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 非递增顺序的最小子序列
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/4
 */
public class LeetCode1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int total = Arrays.stream(nums).sum();
        int n = nums.length;
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            ans.add(nums[i]);
            if (sum * 2 > total) {
                break;
            }
        }
        return ans;
    }
}
