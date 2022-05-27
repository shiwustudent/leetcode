package com.darkgo.interview;

/**
 * <p>
 * 单词距离
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/27
 */
public class Interview1711 {
    public static void main(String[] args) {

    }

    private int findClosest(String[] words, String word1, String word2) {
        int ans = Integer.MAX_VALUE;
        int left = -1, right = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                left = i;
            }
            if (words[i].equals(word2)) {
                right = i;
            }
            if (left != -1 && right != -1) {
                ans = Math.min(ans, Math.abs(left - right));
            }
        }
        return ans;
    }

}
