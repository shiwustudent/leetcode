package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/8
 */
public class LeetCode2185 {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int ans = 0;
        for (String word : words) {
            if (word.length() < n) {
                continue;
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (word.charAt(i) != pref.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }

        }
        return ans;
    }
}
