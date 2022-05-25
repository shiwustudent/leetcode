package com.darkgo.offer;

/**
 * <p>
 * 斐波那契数列
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/24
 */
public class Offer10 {
    public static void main(String[] args) {

    }

    private int fib(int n) {
        int MOD = 1000000007;
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 0; i <= n; i++) {
            q = p;
            p = r;
            r = (q + p) % MOD;
        }
        return r;
    }
}
