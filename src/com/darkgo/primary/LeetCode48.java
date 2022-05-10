package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 旋转图像
 * </p>
 *
 * @author ShiWu
 * @since 2022/4/30
 */
public class LeetCode48 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
    }
    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ma = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ma[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ma[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
