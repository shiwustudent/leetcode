package com.darkgo.primary;

import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * <p>
 * 两个数组间的距离值
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/30
 */
public class LeetCode1385 {

    // 暴力枚举
    private int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = arr1.length;
        int n = arr2.length;
        int ans = 0;
        for (int k : arr1) {
            for (int i : arr2) {
                if (Math.abs(k - i) <= d) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private int findTheDistanceValue1(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int n = arr2.length;
        int ans = 0;
        for (int i : arr1) {
            int low = i - d;
            int high = i + d;
            if (!binarySearch(arr2, low, high)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean binarySearch(int[] arr2, int low, int high) {
        int left = 0, right = arr2.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr2[mid] >= low && arr2[mid] <= high) {
                return true;
            } else if (arr2[mid] < low) {
                left = mid + 1;
            } else if (arr2[mid] > high) {
                right = mid - 1;
            }
        }
        return false;
    }
}
