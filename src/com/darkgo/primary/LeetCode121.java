package com.darkgo.primary;

/**
 * <p>
 * 买卖股票的最佳时机
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/3
 */
public class LeetCode121 {
    public static void main(String[] args) {

    }
    private int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int ans = 0;
        for(int price :prices){
            minPrice = Math.min(minPrice,price);
            ans = Math.max(price-minPrice,ans);
        }
        return ans;
    }
}
