package com.darkgo.primary;

/**
 * <p>
 * 矩阵置零
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/18
 */
public class LeetCode73 {
    public static void main(String[] args) {

    }
    private void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] != 0||cols[j] != 0) {
                    matrix[i][j] = 0;
                }

            }
        }
    }
}
