package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/12
 */
public class LeetCode1781 {
    private int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] cnt = new int[26];
            int max = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                cnt[c - 'a']++;
                max = Math.max(max, cnt[c - 'a']);
                int min = s.length();
                for (int k = 0; k < 26; k++) {
                    if (cnt[k] > 0) {
                        min = Math.min(min, cnt[k]);
                    }
                }
                ans += max - min;
            }
        }
        return ans;
    }
}
