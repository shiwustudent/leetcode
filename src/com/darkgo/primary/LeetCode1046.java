package com.darkgo.primary;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <p>
 * 最后一块石头的重量
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/20
 */
public class LeetCode1046 {
    private int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a > b) {
                queue.offer(a - b);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
