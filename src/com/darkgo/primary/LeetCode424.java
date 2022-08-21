package com.darkgo.primary;

/**
 * <p>
 * 替换后的最长重复字符
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/20
 */
public class LeetCode424 {
    private int characterReplacement(String s, int k) {
        int[] num = new int[26];
        int n = s.length();
        int maxn = 0;
        int left = 0, right = 0;
        while (right < n) {
            num[s.charAt(right) - 'A']++;
            maxn = Math.max(maxn, num[s.charAt(right) - 'A']);
            if (right - left + 1 - maxn > k) {
                num[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }
}
