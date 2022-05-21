package com.darkgo.offer;

/**
 * <p>
 * 在排序数组中查找数字 I
 * </p>
 * 二分查找
 * @author ShiWu
 * @since 2022/5/12
 */
public class Offer53 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int medium;
        while (left < right) {
            medium = (left + right) / 2;
            if (nums[medium] < target) {
                left = medium + 1;
            } else {
                right = medium - 1;
            }
        }
        return nums[left];
    }
}
