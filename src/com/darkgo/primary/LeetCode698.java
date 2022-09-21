package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 划分为k个相等的子集
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/20
 */
public class LeetCode698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        int target = sum / k;
        int n = nums.length;
        int[] bucket = new int[n];

        return dfs(nums, 0, target, k, bucket);
    }

    private boolean dfs(int[] nums, int index, int target, int k, int[] bucket) {
        if (index == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (bucket[i] != target) {
                    return false;
                }
            }
            return true;
        }

        for (int i = 0; i < k; i++) {
            if (bucket[i] + nums[index] > target) {
                continue;
            }
            bucket[i] += nums[i];
            if (dfs(nums, index + 1, target, k, bucket)) {
                return true;
            }
            bucket[i] -= nums[i];
        }
        return false;
    }
}
