package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 * 寻找右区间
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/20
 */
public class LeetCode436 {
    public static void main(String[] args) {

    }

    private static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) {
            return new int[]{-1};
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int min = -1;
            for (int j = 0; j < n; j++) {
                if (intervals[j][0] >= intervals[i][1]) {
                    if (min > intervals[j][0]) {
                        min = intervals[j][0];
                    }
                }
            }
            ans[i] = min;
        }
        return ans;
    }

    private static int[] findRightInterval1(int[][] intervals) {
        int length = intervals.length;
        int[][] startIntervals = new int[length][2];
        for (int i = 0; i < length; i++) {
            startIntervals[i][0] = intervals[i][0];
            startIntervals[i][1] = i;
        }
        Arrays.sort(startIntervals, Comparator.comparingInt(o -> o[0]));
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            int left = 0;
            int right = length - 1;
            int target = -1;
            while (left <= right) {
                int mid = (left + right)/2;
                if (startIntervals[mid][0] >= intervals[i][1]) {
                    right = mid - 1;
                    target = startIntervals[mid][1];
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = target;
        }

        return ans;
    }
}
