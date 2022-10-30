package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/30
 */
public class LeetCode784 {
    private List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s.toCharArray(), 0, ans);
        return ans;

    }

    private void backtrack(char[] chars, int i, List<String> ans) {
        while (i<chars.length && Character.isDigit(chars[i])) {
            i++;
        }
        if (i == chars.length) {
            ans.add(String.valueOf(chars));
            return;
        }
        backtrack(chars, i + 1, ans);
        chars[i] ^= 32;
        backtrack(chars, i + 1, ans);
    }
}
