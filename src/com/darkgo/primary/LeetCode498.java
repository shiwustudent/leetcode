package com.darkgo.primary;

/**
 * <p>
 * 对角线遍历
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/14
 */
public class LeetCode498 {
    public static void main(String[] args) {

    }

    private static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int pos = 0;
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 0) {
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >=0 && y < n) {
                    ans[pos] = mat[x][y];
                    x--;
                    y++;
                    pos++;
                }
            } else {
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - i;
                while (x < m && y >=0) {
                    ans[pos] = mat[x][y];
                    x++;
                    y--;
                    pos++;
                }
            }
        }
        return ans;
    }
}
