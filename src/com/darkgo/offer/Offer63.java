package com.darkgo.offer;

/**
 * <p>
 * 股票的最大利润
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/28
 */
public class Offer63 {
    public static void main(String[] args) {

    }

    private int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(prices[i], min);
            ans = Math.max(prices[i] - min, ans);
        }
        return ans;
    }
}
