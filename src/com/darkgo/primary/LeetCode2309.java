package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/27
 */
public class LeetCode2309 {
    public String greatestLetter(String s) {
        char[] chars = s.toCharArray();
        int lower = 0;
        int upper = 0;
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                lower |= 1 << aChar - 'a';
            } else {
                upper |= 1 << aChar - 'A';
            }
        }
        for (int i = 25; i >= 0; i--) {
            if ((lower & upper & (1 << i)) != 0) {
                return String.valueOf((char) ('A' + i));
            }
        }
        return "";
    }
}
