package com.darkgo.primary;

/**
 * <p>
 * 有效的字母异位词
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/14
 */
public class LeetCode242 {
    public static void main(String[] args) {

    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cnt[c - 'a']--;
            if (cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
