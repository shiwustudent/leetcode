package com.darkgo.primary;

/**
 * <p>
 * 检查单词是否为句中其他单词的前缀
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/21
 */
public class LeetCode1455 {
    //method 1
    private int isPrefixOfWord(String sentence, String searchWord) {
        int ans = -1;
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith(searchWord)) {
                return i;
            }
        }
        return ans;
    }

    //method
    private int isPrefixOfWord2(String sentence, String searchWord) {
        int n = sentence.length(), start = 0, end = 0;
        int ans = 0;
        while (start < n) {
            while (end < n && sentence.charAt(end) != ' ') {
                end++;
            }
            if (isPrefix(sentence, start, end, searchWord)) {
                return ans;
            }
            ans++;
            start = end++;
        }
        return -1;
    }

    private boolean isPrefix(String sentence, int start, int end, String searchWord) {
        if (start + sentence.length() > end) {
            return false;
        }
        for (int i = 0; i < searchWord.length(); i++) {
            if (searchWord.charAt(i) != sentence.charAt(start + i)) {
                return false;
            }
        }
        return true;
    }

}
