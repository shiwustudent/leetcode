package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 * 第 294 场周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/22
 */
public class weekly_contest_294 {
    public static void main(String[] args) {
        // System.out.println(percentageLetter("foobar", 'o'));
        int[] capacity = {10, 2, 2}, rocks = {2, 2, 0};
        int additionalRocks = 100;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));
    }

    private static int percentageLetter(String s, char letter) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == letter) {
                count++;
            }
        }
        return count * 100 / length;
    }

    private static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int length = capacity.length;
        long[] dif = new long[length];
        for (int i = 0; i < length; i++) {
            dif[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(dif);
        int ans = 0;
        for (int i = 0; i < length; i++) {
            additionalRocks -= dif[i];
            if (additionalRocks >= 0) {
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }

    private static int minimumLines(int[][] stockPrices) {
        int length = stockPrices.length;
        if (length == 1) {
            return 0;
        }
        Arrays.sort(stockPrices, Comparator.comparingInt(o -> o[0]));
        int ans = 1;
        for (int i = 2; i < length; i++) {
            int x1 = stockPrices[i][0] - stockPrices[i - 1][0];
            int y1 = stockPrices[i][1] - stockPrices[i - 1][1];
            int x2 = stockPrices[i-1][0] - stockPrices[i - 2][0];
            int y2 = stockPrices[i-1][1] - stockPrices[i - 2][1];
            if (x1*y2!=x2*y1){
                ans++;
            }
        }
        return ans;
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
