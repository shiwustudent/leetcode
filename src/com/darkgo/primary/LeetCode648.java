package com.darkgo.primary;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 单词替换
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/7
 */
public class LeetCode648 {
    public static void main(String[] args) {

    }

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        dictionary.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        StringBuilder builder = new StringBuilder();
        for (String s1 : s) {
            boolean contain = false;
            for (String s2 : dictionary) {
                if (s1.startsWith(s2)) {
                    contain = true;
                    builder.append(s2);
                    break;
                }
            }
            if (!contain) {
                builder.append(s1);
            }
            builder.append(' ');
        }
        return builder.substring(0, builder.length() - 1);
    }

    //set方法
    public String replaceWords2(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        String[] word = sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            String s = word[i];
            for (int j = 0; j < s.length(); j++) {
                if (set.contains(s.substring(0, 1 + j))) {
                    word[i] = s.substring(0, 1 + j);
                    break;
                }
            }
        }
        return String.join(" ", word);
    }
}
