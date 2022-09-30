package com.darkgo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 零矩阵
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/30
 */
public class Interview0108 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new Integer[]{i, j});

                }
            }
        }
        for (Integer[] integers : list) {
            int i = integers[0];
            int j = integers[1];
            for (int k = 0; k < m; k++) {
                matrix[k][j] = 0;
            }
            for (int k = 0; k < n; k++) {
                matrix[i][k] = 0;
            }
        }
    }
}
