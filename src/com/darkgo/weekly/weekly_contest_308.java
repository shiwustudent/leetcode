package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 * 308周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/28
 */
public class weekly_contest_308 {
    public static void main(String[] args) {

    }

    private int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        Arrays.sort(nums);
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            long sum = 0;
            for (int num : nums) {
                sum += num;
                if (sum <= queries[i]) {
                    ans[i]++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }

    private String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar != '*') {
                stack.push(aChar);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    private int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int ans = 0;
        // 记录最远距离
        int m = 0;
        int p = 0;
        int g = 0;
        for (int i = 0; i < n; i++) {
            int length = garbage[i].length();
            ans += length;
            for (int j = 0; j < length; j++) {
                char c = garbage[i].charAt(j);
                if (c == 'M') {
                    m = i;
                } else if (c == 'P') {
                    p = i;
                } else {
                    g = i;
                }
            }
        }
        for (int i = 0; i < travel.length; i++) {
            if (m >= travel[i]) {
                ans += travel[i];
            }
            if (p > travel[i]) {
                ans += travel[i];
            }
            if (g > travel[i]) {
                ans += travel[i];
            }
        }
        return ans;
    }
    private int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[][] ans = new int[k][k];
        
        return ans;
    }
}
