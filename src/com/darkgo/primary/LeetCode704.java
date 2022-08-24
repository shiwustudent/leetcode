package com.darkgo.primary;

/**
 * <p>
 * 二分查找
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/24
 */
public class LeetCode704 {
    private int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
