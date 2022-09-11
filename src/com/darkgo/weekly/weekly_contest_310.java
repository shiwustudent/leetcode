package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 * 第 310 场周赛
 * </p>
 * //TODO 补充第四题
 * @author ShiWu
 * @since 2022/9/11
 */
public class weekly_contest_310 {
    public static void main(String[] args) {

    }

    private int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 != 0) {
                continue;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = -1;
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
                ans = entry.getKey();
            } else if (max == value) {
                ans = Math.min(ans, entry.getKey());
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int partitionString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (set.contains(aChar)) {
                ans++;
                set.clear();
                set.add(aChar);
            } else {
                set.add(aChar);
            }
        }
        return ans;
    }

    private int minGroups(int[][] intervals) {
        int N = 1000010;
        int[] arr = new int[N];
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            arr[start]++;
            arr[end + 1]--;
        }
        int ans = 0;
        int cur = 0;
        for (int i = 0; i < N; i++) {
            cur += arr[i];
            ans = Math.max(cur, ans);
        }
        return ans;
    }
}
