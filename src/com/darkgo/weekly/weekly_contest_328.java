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

    private int[][] rangeAddQueries1(int n, int[][] queries) {
        int[][] dif = new int[n + 1][n + 1];
        int[][] ans = new int[n][n];
        for (int[] query : queries) {
            dif[query[0]][query[1]]++;
            dif[query[0]][query[3] + 1]--;
            dif[query[2] + 1][query[1]]--;
            dif[query[2] + 1][query[3] + 1]++;
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


    private static long countGood(int[] nums, int k) {
        long ans = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        int left = 0, pairs = 0;
        for (int num : nums) {
            // 已经有C个num，新增一个num，多c对
            pairs += cnt.getOrDefault(num, 0);
            cnt.merge(num, 1, Integer::sum);
            // 已经有C个num,去掉一个num，减少c-1对
            while (pairs - (cnt.get(nums[left]) - 1) >= k) {
                pairs -= cnt.merge(nums[left++], -1, Integer::sum);
                if (pairs >= k) {
                    ans += left - 1;
                }
            }
        }
        return ans;
    }
}
