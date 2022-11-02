package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/2
 */
public class LeetCode12 {
    public static void main(String[] args) {
        intToRoman(3999);
    }

    private static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int j = num / values[i];
            if (j != 0) {
                sb.append(strings[i].repeat(j));
                num -= j * values[i];
            }
            if (num == 0) {
                break;
            }
        }
        return sb.toString();
    }
}
