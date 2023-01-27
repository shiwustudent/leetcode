package com.darkgo.note;

import java.util.Arrays;
import java.util.Collections;

/**
 * <p>
 *  二分查找 Arrays.binarySearch
 *  lowerBound 是找 <= target 的第1个数
 *
 *  问题转化：
 *  > target的第1个数 ==> >= target + 1 的第1个数 lowerBound(nums, target + 1)
 *  < target的数 ==> >= target 的前1个数，lowerBound(nums, target) - 1
 *  <= target ==> > target + 1 的前1个数 ==> lowerBound(nums, target + 1) - 1
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/26
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 15, 15, 20, 22, 35};
        System.out.println(Arrays.binarySearch(nums, 15));
        System.out.println(lowerBound(nums, 15));
    }

    public static int lowerBound(int[] nums, int target) {
        // 闭区间[left,right]
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1; //[mid+1,right]
            } else {
                right = mid - 1; //[left,mid-1]
            }
        }
        return left;
    }

    public static int lowerBound1(int[] nums, int target) {
        // 闭区间[left,right)
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1; //[mid+1,right)
            } else {
                right = mid; //[left,mid)
            }
        }
        return left;
    }
}
