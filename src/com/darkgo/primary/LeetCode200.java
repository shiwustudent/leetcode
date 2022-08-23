package com.darkgo.primary;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 * 岛屿数量
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/18
 */
public class LeetCode200 {
    public static void main(String[] args) {

    }

    //method dfs
    // 枚举二维数组中的每个元素，如果是'1'，数量+1，dfs遍历上下左右边界。
    private int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int r, int c) {
        int m = grid.length;
        int n = grid[0].length;
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }

    // method bfs
    private int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    bfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void bfs(char[][] grid, int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == '1') {
                grid[x][y] = '0';
                bfs(grid, x - 1, y);
                bfs(grid, x + 1, y);
                bfs(grid, x, y - 1);
                bfs(grid, x, y + 1);
            }
        }
    }
}
