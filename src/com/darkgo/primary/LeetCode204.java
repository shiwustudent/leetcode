package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 计数质数
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/30
 */
public class LeetCode204 {
    public static void main(String[] args) {
        countPrimes(10);
    }

    //解1 暴力法
    private static int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //解2
    private static int countPrimes1(int n) {
        int[] primes = new int[n];
        Arrays.fill(primes, 1);
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i] == 1) {
                ans++;
                if (i * i < n) {
                    for (int j = i * i; j < n; j++) {
                        primes[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
