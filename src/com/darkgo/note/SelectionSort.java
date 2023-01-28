package com.darkgo.note;

import java.util.jar.JarEntry;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/19
 */
public class SelectionSort {
    private int[] selectionSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int mixIndex = i;
            for (int j = i + 1; j < n; j++) {
                mixIndex = nums[j] < nums[mixIndex] ? j : mixIndex;
            }
            swap(nums, mixIndex, i);
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
