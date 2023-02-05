package com.darkgo.primary;

/**
 * <p>
 *  前缀和，解决的是区间求和的问题
 *  创建n+1的数组
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/5
 */
public class LeetCode303 {
    private class NumArray {
        int[] arr;

        public NumArray(int[] nums) {
            arr = new int[nums.length+1];
            arr[0] = nums[0];
            for(int i=0;i<nums.length;i++){
                arr[i+1] = nums[i]+arr[i];
            }
        }

        public int sumRange(int left, int right) {
            return arr[right+1] - arr[left];
        }
    }
}
