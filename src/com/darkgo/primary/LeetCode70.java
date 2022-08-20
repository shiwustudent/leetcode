package com.darkgo.primary;

/**
 * <p>
 * 爬楼梯
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/19
 */
public class LeetCode70 {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
