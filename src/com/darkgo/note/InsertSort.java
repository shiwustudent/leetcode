package com.darkgo.note;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/19
 */
public class InsertSort {
    private void insertSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0 && nums[j] > nums[j + 1]; j--) {
                swap(nums, j, j + 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
