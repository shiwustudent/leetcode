package com.darkgo.primary;

/**
 * <p>
 * 斐波那契数
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/17
 */
public class LeetCode509 {
    // recursion
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // dp
    public int fib1(int n) {
        if (n < 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //dp
    public int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
