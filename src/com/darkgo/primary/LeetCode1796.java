package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/3
 */
public class LeetCode1796 {
    public static void main(String[] args) {
        secondHighest("ck077");
    }
    private static int secondHighest(String s) {
        int ans = -1;
        boolean[] chars = new boolean[10];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                chars[s.charAt(i) - '0'] = true;
            }
        }
        boolean min = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (min && chars[i]) {
                ans = i;
                break;
            }
            if (chars[i]) {
                min = true;
            }
        }

        return ans;
    }
}
