package com.darkgo.primary;

import java.util.Queue;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/2
 */
public class LeetCode1620 {
    public static void main(String[] args) {
        bestCoordinate(new int[][]{{0, 1, 2}, {2, 1, 2}, {1, 0, 2}, {1, 2, 2}},
                1);
    }

    private static int[] bestCoordinate(int[][] towers, int radius) {
        int[] ans = new int[2];
        int max = 0;
        for (int i = 0; i <= 50; i++) {
            for (int j = 0; j <= 50; j++) {
                int sum = 0;
                for (int[] tower : towers) {
                    int x = tower[0];
                    int y = tower[1];
                    int q = tower[2];
                    double sqrt = Math.sqrt((x - i) * (x - i) + (y - j) * (y - j));
                    if (sqrt > radius) {
                        continue;
                    }
                    sum += q / (1 + sqrt);
                    System.out.println(sum);
                }
                if (sum > max) {
                    max = sum;
                    ans = new int[]{i, j};
                } else if (sum == max) {
                    if (i < ans[0] || (i == ans[0] && j < ans[1])) {
                        ans = new int[]{i, j};
                    }
                }
            }
        }
        return ans;
    }
}
