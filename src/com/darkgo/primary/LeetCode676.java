package com.darkgo.primary;

/**
 * <p>
 * 实现一个魔法字典
 *
 * TODO 补充字典树解法
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/11
 */
public class LeetCode676 {
    private class MagicDictionary {

        String[] dictionary;

        public MagicDictionary() {

        }

        public void buildDict(String[] dictionary) {
            this.dictionary = dictionary;
        }

        public boolean search(String searchWord) {
            for (String value : dictionary) {
                int dif = 0;
                if (searchWord.length() != value.length()) {
                    continue;
                }
                for (int j = 0; j < value.length(); j++) {
                    char c = value.charAt(j);
                    char s = searchWord.charAt(j);
                    if (c != s) {
                        dif++;
                    }
                }
                if (dif == 1) {
                    return true;
                }
            }
            return false;
        }
    }
}
