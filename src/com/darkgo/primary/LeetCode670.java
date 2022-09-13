package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 最大交换
 * </p>
 * //TODO 补充贪心方法
 * @author ShiWu
 * @since 2022/9/13
 */
public class LeetCode670 {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int n = chars.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                swap(chars, i, j);
                max = Math.max(Integer.parseInt(String.valueOf(chars)), max);
                swap(chars, j, i);
            }
        }
        return max;
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
