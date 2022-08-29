package com.darkgo.primary;

/**
 * <p>
 * 有效的完全平方数
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/29
 */
public class LeetCode367 {
    //Method 1 Build in library function
    private boolean isPerfectSquare(int num) {
        int x = (int) Math.sqrt(num);
        return x * x == num;
    }

    // 暴力枚举
    private boolean isPerfectSquare2(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return true;
            } else if (i * i > num) {
                return false;
            }
        }
        return false;
    }

    // 二分
    private boolean isPerfectSquare3(int num) {
        int left = 1, right = num;
        while (left >= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return false;
    }
}
