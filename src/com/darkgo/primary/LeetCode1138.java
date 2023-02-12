package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/12
 */
public class LeetCode1138 {
    public String alphabetBoardPath(String target) {
        char[] chars = target.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0, j = 0;
        for (char aChar : chars) {
            int index = aChar - 'a';
            int x = index / 5;
            int y = index % 5;
            while (i < x) {
                i++;
                stringBuilder.append('U');
            }
            while (i > x) {
                i--;
                stringBuilder.append('D');
            }
            while (j > y) {
                j--;
                stringBuilder.append("L");
            }
            while (j < y) {
                j++;
                stringBuilder.append("R");
            }

            stringBuilder.append("!");
        }
        return stringBuilder.toString();
    }
}
