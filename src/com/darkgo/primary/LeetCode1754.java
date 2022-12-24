package com.darkgo.primary;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/24
 */
public class LeetCode1754 {
    private String largestMerge(String word1, String word2) {
        int index1 = 0, index2 = 0;
        StringBuilder sb = new StringBuilder();
        while (index1 < word1.length() && index2 < word2.length()) {
            if (word1.substring(index1).compareTo(word2.substring(index2)) > 0) {
                sb.append(word1.charAt(index1++));
            } else {
                sb.append(word2.charAt(index2++));
            }
        }
        while (index1 < word1.length()) {
            char c = word1.charAt(index1++);
            sb.append(c);
        }
        while (index2 < word2.length()) {
            char c = word2.charAt(index2++);
            sb.append(c);
        }
        return sb.toString();
    }
}
