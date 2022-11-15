package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/15
 */
public class LeetCode22 {
    private List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(ans, sb, n, n);
        return ans;
    }

    private void backtrack(List<String> ans, StringBuilder sb, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(sb.toString());
            return;
        }
        if (left > 0) {
            sb.append('(');
            backtrack(ans, sb, left - 1, right);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right > left) {
            sb.append(')');
            backtrack(ans, sb, left, right - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

