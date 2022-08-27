package com.darkgo.primary;

/**
 * <p>
 * x 的平方根
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/27
 */
public class LeetCode69 {
    private int mySqrt(int x) {
        int left = 1, right = x, ans = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
