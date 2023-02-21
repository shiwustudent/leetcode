package com.darkgo.primary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/21
 */
public class LeetCode1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double x = 1.0*(o1[0] + 1) / (o1[1] + 1) - 1.0*o1[0] / o1[1];
                double y = 1.0*(o2[0] + 1) / (o2[1] + 1) - 1.0*o2[0] / o2[1];
                return Double.compare(y, x);
            }
        });
        priorityQueue.addAll(Arrays.asList(classes));
        for (int i = 0; i < extraStudents; i++) {
            int[] poll = priorityQueue.poll();
            poll[0] = poll[0] + 1;
            poll[1] = poll[1] + 1;
            System.out.println(Arrays.toString(poll));
            priorityQueue.add(poll);
        }
        double ans = 0;
        for (int[] ints : priorityQueue) {
            ans += 0.1 * ints[0] / ints[1];
        }
        ans /= classes.length;
        return ans;
    }
}
