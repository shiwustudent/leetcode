package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/29
 */
public class LeetCode2315 {
    private int countAsterisks(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (char c : chars) {
            if (c == '|') {
                flag = !flag;
            }
            if (flag && c == '*') {
                ans++;

            }
        }
        return ans;
    }
}
