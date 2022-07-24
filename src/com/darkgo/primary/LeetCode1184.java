package com.darkgo.primary;

/**
 * <p>
 * 公交站间的距离
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/24
 */
public class LeetCode1184 {
    private int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = destination;
            destination = start;
            start = temp;
        }
        int n = distance.length;
        int sum1=0,sum2=0;
        for (int i = 0; i < n; i++) {
            if (i >= start && i < destination) {
                sum1+=distance[i];
            } else {
                sum2+=distance[i];
            }
        }
        return Math.min(sum1, sum2);
    }
}
