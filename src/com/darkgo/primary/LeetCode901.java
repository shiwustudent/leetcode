package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/21
 */
public class LeetCode901 {

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(70));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(75));
        System.out.println(stockSpanner.next(85));
        System.out.println(stockSpanner.next(65));
    }


    static class StockSpanner {
        Deque<int[]> stack;
        int idx;

        public StockSpanner() {
            stack = new ArrayDeque<>();
            idx = -1;
            stack.push(new int[]{idx, Integer.MAX_VALUE});
        }

        public int next(int price) {
            idx++;
            while (price >= stack.peek()[1]) {
                stack.pop();
            }
            int ret = idx - stack.peek()[0];
            stack.push(new int[]{idx, price});
            return ret;
        }
    }
}
