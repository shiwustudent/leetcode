package com.darkgo.note;

/**
 * <p>
 *  差分
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/18
 */
public class Dif {
    /**
     * 二维差分
     * @param n
     * @param queries
     * @return
     */
    private int[][] rangeAddQueries1(int n, int[][] queries) {
        int[][] dif = new int[n + 1][n + 1];
        int[][] ans = new int[n][n];
        for (int[] query : queries) {
            dif[query[0]][query[1]]++;
            dif[query[0]][query[3]+1]--;
            dif[query[2]+1][query[1]]--;
            dif[query[2]+1][query[3]+1]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dif[i][j] += dif[i][j - 1];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dif[i][j] += dif[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = dif[i][j];
            }
        }
        return ans;
    }
}
