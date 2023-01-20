package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/20
 */
public class LeetCode1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Arrays.sort(logs, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        System.out.println(Arrays.deepToString(logs));
        int[] last = logs[0];
        for (int i = 1; i < logs.length; i++) {
            if (logs[i][0] == last[0]) {
                if (logs[i][1] == last[1]) {
                    continue;
                }
            } else {
                last = logs[i];
            }
            ans[logs[i][0]]++;
        }
        return ans;
    }
}
