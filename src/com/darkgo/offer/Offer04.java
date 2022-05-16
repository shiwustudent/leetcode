package com.darkgo.offer;

/**
 * <p>
 * 二维数组中的查找
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/14
 */
public class Offer04 {
    public static void main(String[] args) {

    }

    private boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, bottom = n - 1;
        while (left < m && bottom >= 0) {
            if (matrix[left][bottom] == target) {
                return true;
            } else if (matrix[left][bottom] > target) {
                left++;
            } else {
                bottom--;
            }
        }
        return false;
    }
}
