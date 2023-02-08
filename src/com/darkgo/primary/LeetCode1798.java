package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 如果可以凑出[0,x] 再来一个y，如果y小于等于x，可以凑出[0,x+y]
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
