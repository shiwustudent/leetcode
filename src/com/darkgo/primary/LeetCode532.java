package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 数组中的 k-diff 数对
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/16
 */
public class LeetCode532 {
    public static void main(String[] args) {
        System.out.println((7+8)/2);
    }

    private int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = 1;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < n) {
            if (nums[right] - nums[left] == k) {
                ans++;
                left++;
                right++;
                map.put(nums[left], nums[right]);
            } else if (nums[right] - nums[left] < k) {
                right++;
            } else {
                left++;
            }
        }
        return map.size();
    }

    private int findPairs1(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int num : nums) {
            if (visited.contains(num - k)) {
                res.add(num);
            }
            if (visited.contains(num + k)) {
                res.add(num + k);
            }
            visited.add(num);
        }
        return res.size();
    }
}
