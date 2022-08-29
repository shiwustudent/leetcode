package com.darkgo.primary;

/**
 * <p>
 * 山脉数组的峰顶索引
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/29
 */
public class LeetCode852 {
    //enum 枚举
    private int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    private int peakIndexInMountainArray1(int[] arr) {
        int n = arr.length;
        int left = 1, right = n - 2;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
