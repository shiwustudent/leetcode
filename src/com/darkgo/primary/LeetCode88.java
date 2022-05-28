package com.darkgo.primary;

/**
 * <p>
 * 合并两个有序数组
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/27
 */
public class LeetCode88 {
    public static void main(String[] args) {

    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] >= nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}
