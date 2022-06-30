package com.darkgo.primary;

/**
 * <p>
 * 质数排列
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/30
 */
public class LeetCode1175 {
    static final int MOD = 1000000007;
    private int numPrimeArrangements(int n) {
        int primeNumber =0;
        for (int i = 2; i <= n; i++) {
            primeNumber += isPrime(i) ? 1 : 0;
        }
        return (int) (factorial(primeNumber) * factorial(n - primeNumber)% MOD) ;
    }
    private boolean isPrime(int x){
        for (int i = 2; i*i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            res %= MOD;
        }
        return res;
    }
}
