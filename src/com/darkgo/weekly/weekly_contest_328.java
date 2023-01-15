package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/15
 */
public class weekly_contest_328 {
    public static void main(String[] args) {
        countGood(new int[]{3, 1, 4, 3, 2, 2, 4}, 2);
    }

    private int differenceOfSum(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int ans = 0;
        for (int num : nums) {
            while (num != 0) {
                ans += num % 10;
                num = num / 10;
            }
        }
        return Math.abs(sum - ans);
    }

    private int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[2]; i++) {
                for (int j = query[1]; j <= query[3]; j++) {
                    ans[i][j]++;
                }
            }
        }
        return ans;
    }


    private static long countGood(int[] nums, int k) {
        long ans = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                max++;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int cur = 0;
        for (int num : nums) {
            cur += max - map.get(num) - 1;
            if (cur >= k) {
                ans++;
                cur = 0;
            }
            map.put(num, map.get(num) - 1);
        }
        return ans;
    }
}
