package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 有效的数独
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/3
 */
public class LeetCode36 {
    public static void main(String[] args) {

    }

    private boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][][] sub = new int[3][3][9];
        int length = board.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int num = c - '0' - 1;
                rows[i][num]++;
                cols[j][num]++;
                sub[i/3][j/3][num]++;
                if (rows[i][num] > 1 || cols[j][num] > 1 || sub[i / 3][j / 3][num] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
