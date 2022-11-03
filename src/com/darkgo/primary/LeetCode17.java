package com.darkgo.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/3
 */
public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        Map<Character, String> map = new HashMap<>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        StringBuilder sb = new StringBuilder();
        backtrack(map, digits,0, sb, ans);
        return ans;
    }

    private void backtrack(Map<Character, String> map, String digits, int index, StringBuilder sb, List<String> ans) {
        if (index == map.size()) {
            ans.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        String s = map.get(c);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backtrack(map, digits, index + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
