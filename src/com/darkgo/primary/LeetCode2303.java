package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/23
 */
public class LeetCode2303 {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (income >= brackets[i][0]) {
                if (i == 0) {
                    ans += (double) brackets[i][0] * brackets[i][1] / 100;
                } else {
                    ans += (double) (brackets[i][0] - brackets[i - 1][0]) * brackets[i][1] / 100;
                }
            } else {
                if (i > 0) {
                    ans += (double) (income - brackets[i - 1][0]) * brackets[i][1] / 100;
                } else {
                    ans += (double) (income) * brackets[i][1] / 100;
                }
                return ans;
            }
        }

        return ans;
    }
}
