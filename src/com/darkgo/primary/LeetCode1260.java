package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 二维网格迁移
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/20
 */
public class LeetCode1260 {
    private List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> temp = new ArrayList<>();
        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                temp.add(ints[j]);
            }
        }
        for (int i = 0; i < k; i++) {
            temp.add(0, temp.remove(temp.size() - 1));
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                rows.add(temp.get(index++));
            }
            ans.add(rows);
        }
        return ans;
    }
}
