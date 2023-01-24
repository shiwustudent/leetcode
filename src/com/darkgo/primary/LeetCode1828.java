package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/24
 */
public class LeetCode1828 {
    private int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int circleX = queries[i][0];
            int circleY = queries[i][1];
            int r = queries[i][2];
            for (int[] point : points) {
                int x = point[0];
                int y = point[0];
                if ((x - circleX) * (x - circleX) + (y - circleY) * (y - circleY) <= r * r) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
