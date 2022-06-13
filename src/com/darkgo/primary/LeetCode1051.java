package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 高度检查器
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/13
 */
public class LeetCode1051 {
    public static void main(String[] args) {

    }

    private int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                ans++;
            }
        }
        return ans;
    }
}
