package com.darkgo.primary;

/**
 * <p>
 * 阶乘后的零
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/29
 */
public class LeetCode172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes2(2));
    }
    private int trailingZeroes(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int c = i;
            while (c % 5 == 0) {
                c /= 5;
                ans++;
            }
        }
        return ans;
    }

    private static int trailingZeroes2(int n) {
        int ans = 0;
        while (n > 0) {
            n /=5;
            ans += n;
        }
        return ans;
    }
}
