package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * <p>
 * 最近的请求次数
 * </p>
 * 队列
 * @author ShiWu
 * @since 2022/5/6
 */
public class LeetCode933 {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);     // requests = [1]，范围是 [-2999,1]，返回 1
        recentCounter.ping(100);   // requests = [1, 100]，范围是 [-2900,100]，返回 2
        recentCounter.ping(3001);  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3
        recentCounter.ping(3002);
        recentCounter.ping(3005);
        recentCounter.ping(6000);
        recentCounter.ping(6001);
        recentCounter.ping(9000);
    }

    static class RecentCounter {
        Deque<Integer> deque;

        public RecentCounter() {
            deque = new ArrayDeque<>();
        }

        public int ping(int t) {
            deque.offer(t);
            while (deque.peek() < t - 3000) {
                deque.poll();
            }
            System.out.println(deque.size());
            return deque.size();
        }
    }

}
