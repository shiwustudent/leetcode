package com.darkgo.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * 数组中的字符串匹配
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/6
 */
public class LeetCode1408 {
    public static void main(String[] args) {
        String[] words = new String[]{"leetcode", "et", "code"};
        stringMatching(words);
    }
    private static List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
