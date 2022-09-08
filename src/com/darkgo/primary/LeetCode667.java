package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 优美的排列 II
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/8
 */
public class LeetCode667 {
    public static void main(String[] args) {

    }
    private int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int i = 0;
        int start = 1, end = n;
        for (int j = 0; j < k; j++) {
            if (j % 2 == 0) {
                ans[i++] = start++;
            } else {
                ans[i++] = end--;
            }
        }
        System.out.println(Arrays.toString(ans));
        if (k % 2 == 0) {
            while (i < n) {
                ans[i++] = end--;
            }
        } else {
            while (i < n) {
                ans[i++] = start++;
            }
        }
        return ans;
    }
}
