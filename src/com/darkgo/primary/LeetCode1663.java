package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/26
 */
public class LeetCode1663 {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if ((n - i - 1) * 26 >= k) {
                sb.append('a');
                k -= 1;
            } else {
                int cur = k - (n - i - 1) * 26;
                k -= cur;
                sb.append((char) ('a' + cur - 1));
            }
        }
        return sb.toString();
    }
}
