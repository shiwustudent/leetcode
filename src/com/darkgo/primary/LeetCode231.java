package com.darkgo.primary;

/**
 * <p>
 * 2 的幂
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/6
 */
public class LeetCode231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }

    private static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
