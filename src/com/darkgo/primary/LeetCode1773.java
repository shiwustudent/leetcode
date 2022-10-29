package com.darkgo.primary;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/29
 */
public class LeetCode1773 {
    private int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        if ("type".equals(ruleKey)) {
            type = 0;
        } else if ("color".equals(ruleKey)) {
            type = 1;
        } else {
            type = 2;
        }
        int ans = 0;
        for (List<String> item : items) {
            if (item.get(type).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
