package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/16
 */
public class LeetCode1813 {
    public static void main(String[] args) {

    }

    private boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        int minLength = Math.min(words1.length, words2.length);
        int i = 0, j = 0;
        while (i < minLength && words1[i].equals(words2[i])) {
            i++;
        }
        while (j < minLength - i && words1[words1.length - 1 - j].equals(words2[words2.length - 1 - j])) {
            j++;
        }
        return i + j == minLength;
    }
}
