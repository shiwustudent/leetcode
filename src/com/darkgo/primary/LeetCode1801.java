package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/2
 */
public class LeetCode1801 {
    public static void main(String[] args) {
        int[][] orders = {{27, 30, 0}, {10, 10, 1}, {28, 17, 1}, {19, 28, 0}, {16, 8, 1}, {14, 22, 0}, {12, 18, 1}, {3, 15, 0}, {25, 6, 1}};
        getNumberOfBacklogOrders(orders);
    }

    private static int getNumberOfBacklogOrders(int[][] orders) {
        int MOD = 1000000007;
        PriorityQueue<int[]> buyOrders = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        PriorityQueue<int[]> sellOrders = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        for (int[] order : orders) {
            int price = order[0], amount = order[1], orderType = order[2];
            if (orderType == 0) {
                while (amount > 0 && !sellOrders.isEmpty() && sellOrders.peek()[0] <= price) {
                    int[] sellOrder = sellOrders.poll();
                    int sellAmount = Math.min(amount, sellOrder[1]);
                    amount -= sellAmount;
                    sellOrder[1] -= sellAmount;
                    if (sellOrder[1] > 0) {
                        sellOrders.offer(sellOrder);
                    }
                }
                if (amount > 0) {
                    buyOrders.offer(new int[]{price, amount});
                }
            } else {
                while (amount > 0 && !buyOrders.isEmpty() && price <= buyOrders.peek()[0]) {
                    int[] buyOrder = buyOrders.poll();
                    int buyAmount = Math.min(amount, buyOrder[1]);
                    amount -= buyAmount;
                    buyOrder[1] -= buyAmount;
                    if (buyOrder[1] > 0) {
                        buyOrders.offer(buyOrder);
                    }
                }
                if (amount > 0) {
                    sellOrders.offer(new int[]{price, amount});
                }
            }
        }
        int total = 0;
        for (int[] buyOrder : buyOrders) {
            total += buyOrder[1];
            total %= MOD;
        }
        for (int[] sellOrder : sellOrders) {
            total += sellOrder[1];
            total %= MOD;
        }
        return total;
    }
}
