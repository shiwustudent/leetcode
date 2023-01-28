package com.darkgo.note;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/19
 */
public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j + 1] > nums[j]) {
                    swap(nums, j + 1, j);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
