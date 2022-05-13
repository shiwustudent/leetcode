package com.darkgo.offer;

/**
 * <p>
 * 在排序数组中查找数字 I
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/12
 */
public class Offer53_2 {
    public static void main(String[] args) {
        int[] nums = {0,2};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int m = (right + left) / 2;
            if (nums[m] == m) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }
        return left;
    }
}
