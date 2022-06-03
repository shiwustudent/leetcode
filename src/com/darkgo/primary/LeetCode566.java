package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 重塑矩阵
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/3
 */
public class LeetCode566 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[row][col] = mat[i][j];
                if (col == c - 1) {
                    row++;
                    col = 0;
                }else {
                    col++;
                }
            }
        }
        return ans;
    }
}
