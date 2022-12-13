package com.darkgo.primary;

/**
 * <p>
 * 判断句子是否为全字母句
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/13
 */
public class LeetCode1832 {
    private boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        int[] cnt = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            cnt[c - 'a']++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
