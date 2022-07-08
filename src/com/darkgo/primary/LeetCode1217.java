package com.darkgo.primary;

/**
 * <p>
 * 玩筹码
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/8
 */
public class LeetCode1217 {
    private int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int i : position) {
            if ((i & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
