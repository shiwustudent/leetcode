package com.darkgo.primary;

/**
 * <p>
 * 排列硬币
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/1
 */
public class LeetCode441 {
    // 数学解法
    // 统计n={x(x+1)}/2
    private int arrangeCoins(int n) {
        //b^2-4ac>=0 有解
        return (-1 + (int) Math.sqrt(8 * n + 1)) / 2;
    }

    //二分
    private int arrangeCoins2(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if ((long) mid * (mid + 1) < 2L * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
