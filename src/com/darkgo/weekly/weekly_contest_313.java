package com.darkgo.weekly;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 第 313 场周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/2
 */
public class weekly_contest_313 {
    public static void main(String[] args) {
        minimizeXor(3, 5);
    }

    public int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int ans = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static int maxSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int cnt = 0;
                for (int k = 0; k < 3; k++) {
                    cnt += grid[i][j + k];
                    cnt += grid[2 + i][j + k];
                }
                cnt += grid[i + 1][j];
                max = Math.max(cnt, max);
            }
        }
        return max;
    }

    private static int minimizeXor(int num1, int num2) {
        int cnt = Integer.bitCount(num2);
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if ((num1 >> i & 1) == 1) {
                res |= 1 << i;
                cnt--;
                if (cnt == 0) {
                    break;
                }
            }
        }
        if (cnt > 0) {
            for (int i = 0; i < 31; i++) {
                if ((num1 >> i & 1) == 0) {
                    res |= 1 >> i;
                    cnt--;
                    if (cnt == 0) {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
