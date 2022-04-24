package com.darkgo.primary;

/**
 * <p>
 * 二进制间距
 * </p>
 *
 * @author ShiWu
 * @since 2022/4/24
 */
public class LeetCode868 {
    public static void main(String[] args) {
//        int n = 22;
        int n = 5;
        System.out.println(new Solution().binaryGap(n));
    }

    static class Solution {
        public int binaryGap(int n) {
            String s = Integer.toBinaryString(n);
            int left = 0;
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' == 1) {
                    ans = Math.max(ans, i - left);
                    left = i;
                }
            }
            return ans;
        }
    }
}
