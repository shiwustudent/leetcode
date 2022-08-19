package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 在既定时间做作业的学生人数
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/19
 */
public class LeetCode1450 {
    // method1 enumeration
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                ans++;
            }
        }
        return ans;
    }

    //method2 差分数组 求前缀和
    public int busyStudent2(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int maxEndTime = Arrays.stream(endTime).max().getAsInt();
        if (maxEndTime < queryTime) {
            return 0;
        }
        int[] cnt = new int[maxEndTime + 2];
        for (int i = 0; i < n; i++) {
            cnt[startTime[i]]++;
            cnt[endTime[i] + 1]--;
        }
        int ans = 0;
        for (int i = 0; i <= queryTime; i++) {
            ans += cnt[i];
        }
        return ans;
    }
}
