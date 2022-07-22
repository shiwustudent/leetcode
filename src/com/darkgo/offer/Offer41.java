package com.darkgo.offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 滑动窗口的平均值
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/18
 */
public class Offer41 {
    public static void main(String[] args) {

    }

    private class MovingAverage {
        Deque<Integer> queue = new ArrayDeque<>();
        int size;
        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size = size;
        }

        public double next(int val) {
            if (queue.size() == size) {
                queue.poll();
            }
            queue.offer(val);
            double sum = 0;
            for (Integer integer : queue) {
                sum += integer;
            }
            return sum / queue.size();
        }
    }
}
