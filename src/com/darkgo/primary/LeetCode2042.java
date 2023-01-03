package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/3
 */
public class LeetCode2042 {
    private static boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                list.add(Integer.parseInt(word));
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean areNumbersAscending1(String s) {
        int pre = 0, pos = 0;
        while (pos < s.length()) {
            if (Character.isDigit(s.charAt(pos))) {
                int cur = 0;
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    cur += cur * 10 + (s.charAt(pos) - '0');
                    pos++;
                }
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            } else {
                pos++;
            }
        }
        return true;
    }
}
