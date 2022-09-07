package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 重新排列单词间的空格
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/7
 */
public class LeetCode1592 {
    private String reorderSpaces(String text) {
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                spaces++;
            }
        }
        String[] s = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() != 0) {
                list.add(s[i]);
            }
        }
        if (list.size() == 1) {
            return list.get(0) + " ".repeat(spaces);
        }
        int count = spaces / (list.size() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i == list.size() - 1) {
                break;
            }
            sb.append(" ".repeat(count));
        }
        int remender = spaces % (list.size() - 1);
        return sb.append(" ".repeat(remender)).toString();

    }
}
