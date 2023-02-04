package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/4
 */
public class LeetCode1798 {
    private int getMaximumConsecutive(int[] coins) {
        int ans = 1;
        Arrays.sort(coins);
        for (int coin : coins) {
            if (ans < coin) {
                break;
            }
            ans += coin;
        }
        return ans;
    }
}
