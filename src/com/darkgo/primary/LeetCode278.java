package com.darkgo.primary;

/**
 * <p>
 * 第一个错误的版本
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/27
 */
public class LeetCode278 {
    public static void main(String[] args) {

    }

    private int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int n) {
        return false;
    }
}
