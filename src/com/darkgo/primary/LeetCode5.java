package com.darkgo.primary;

/**
 * <p>
 * 最长回文子串
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/3
 */
public class LeetCode5 {
    public static void main(String[] args) {
        // String s = "babad";
        String s = "cbbd";
        System.out.println(new Solution().longestPalindrome(s));
    }

    static class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();
            if (n < 2) {
                return s;
            }
            int start = 0;
            int maxLen = 1;
            char[] chars = s.toCharArray();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (j - i + 1 > maxLen && validPalindromic(chars, i, j)) {
                        maxLen = j - i + 1;
                        start = i;
                    }
                }
            }
            return s.substring(start, maxLen + start);
        }

        private boolean validPalindromic(char[] chars, int left, int right) {
            while (left < right) {
                if (chars[left] != chars[right]) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
