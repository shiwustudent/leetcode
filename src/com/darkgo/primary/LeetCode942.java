package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 增减字符串匹配
 * </p>
 * 贪心算法
 * @author ShiWu
 * @since 2022/5/9
 */
public class LeetCode942 {
    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));

    }
    private static int[] diStringMatch(String s) {
        int n = s.length();
        int start = 0;
        int[] ans = new int[n+1];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'D') {
                ans[i] = n--;
            } else {
                ans[i] = start++;
            }
        }
        ans[s.length()] = n;
        return ans;
    }
}
