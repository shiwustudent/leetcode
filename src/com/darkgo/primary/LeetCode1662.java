package com.darkgo.primary;

/**
 * <p>
 * 检查两个字符串数组是否相等
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/1
 */
public class LeetCode1662 {
    private boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n = word1.length;
        for (String word : word1) {
            sb1.append(word);
        }
        for (String word : word2) {
            sb2.append(word);
        }
        return sb1.toString().equals(sb2.toString());
    }

    private boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        int i = 0, j = 0;
        int index1 = 0, index2 = 0;
        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(index1) != word2[j].charAt(index2)) {
                return false;
            }
            index1++;
            index2++;
            if (index1 == word1[i].length()) {
                index1 = 0;
                i++;
            }
            if (index2 == word1[j].length()) {
                index2 = 0;
                j++;
            }
        }
        return true;
    }
}
