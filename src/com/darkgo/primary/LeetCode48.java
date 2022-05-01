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
        new Solution().rotate(matrix);
    }

    static class Solution {
        public void rotate(int[][] matrix) {
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

        public void rotate2(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n+1) / 2 ; j++) {
                    int temp = matrix[n - i - 1][n - j - 1];
                    matrix[j][n - i - 1] = matrix[i][j];
                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                    matrix[i][j] = temp;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
