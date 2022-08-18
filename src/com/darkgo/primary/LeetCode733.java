package com.darkgo.primary;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 * 图像渲染
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/18
 */
public class LeetCode733 {


    // method1 bfs
    private int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1, 0};
        int currentColor = image[sr][sc];
        if (image[sr][sc] != newColor) {
            return image;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        int m = image.length, n = image[0].length;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < m && my >= 0 && my < n && image[mx][my] == currentColor) {
                    queue.add(new int[]{mx, my});
                    image[mx][my] = newColor;
                }
            }

        }
        return image;
    }

    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    //method dfs
    private int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
            ;
        }
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;
            for (int i = 0; i < 4; i++) {
                int x = sr + dx[i], y = sc + dy[i];
                if (x>=0&&x<image.length&&y>=0&&y<image[0].length){
                    dfs(image, x, y, color, newColor);
                }
            }
        }

    }

}
