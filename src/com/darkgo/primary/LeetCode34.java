package com.darkgo.primary;

/**
 * <p>
 * 在排序数组中查找元素的第一个和最后一个位置
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/1
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return new int[]{-1, -1};
        }
        int firstIndex = findFistIndex(nums, target);
        if (firstIndex == -1) {
            return new int[]{-1, -1};
        }
        int lastIndex = findLastIndex(nums, target);
        return new int[]{firstIndex, lastIndex};
    }

    private int findLastIndex(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] < target) {
                // 下个区间范围 【mid+1,right]
                left = mid + 1;
            } else if (nums[mid] == target) {
                //区间范围【left,mid】
                left = mid;
            } else if (nums[mid] > target) {
                //区间范围【left,mid】
                right = mid-1;
            }
        }

        return left;
    }

    private int findFistIndex(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // 下个区间范围 【mid+1,right]
                left = mid + 1;
            } else if (nums[mid] == target) {
                //区间范围【left,mid】
                right = mid;
            } else if (nums[mid] > target) {
                //区间范围【left,mid-1】
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
