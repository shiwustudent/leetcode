package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/8
 */
public class LeetCode870 {
    private int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int n = nums1.length;
        Integer[] index1 = new Integer[n];
        Integer[] index2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            index1[i] = i;
            index2[i] = i;
        }
        Arrays.sort(index1, Comparator.comparingInt(o -> nums1[o]));
        Arrays.sort(index2, Comparator.comparingInt(o -> nums2[o]));
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums1[index1[i]] > nums2[index2[left]]) {
                ans[index2[left]] = nums1[index1[i]];
                left++;
            } else {
                ans[index2[right]] = nums1[index1[i]];
                right--;
            }
        }
        return ans;
    }
}
