package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 三维形体投影面积
 * </p>
 * 有个技巧，二维数组中求每列的最大值nums[j][i]
 * 时间O(n)
 * 空间O(1)
 * @author ShiWu
 * @since 2022/4/26
 */
public class LeetCode883 {
    public static void main(String[] args) {
        // int[][] grid = {{2}};
        // int[][] grid = {{1, 2}, {3, 4}};
        // int[][] grid = {{1, 0}, {0, 2}};
        int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(new Solution().projectionArea(grid));
    }

    static class Solution {
        public int projectionArea(int[][] grid) {
            int x = 0, y = 0, z = 0;
            if (grid[0].length == 0) {
                return 0;
            }
            for (int i = 0; i < grid.length; i++) {
                int xMax = 0;
                int yMax = 0;
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] != 0) {
                        z += 1;
                    }
                    xMax = Math.max(xMax, grid[i][j]);
                    // 每列最大值
                    yMax = Math.max(yMax, grid[j][i]);
                }
                x += xMax;
                y += yMax;
            }
            return x + y + z;
        }
    }
}
