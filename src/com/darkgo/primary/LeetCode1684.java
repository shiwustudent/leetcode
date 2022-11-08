package com.darkgo.primary;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/11/8
 */
public class LeetCode1684 {
    private int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int ans = 0;
        for (String word : words) {
            boolean flag = false;
            for (int j = 0; j < word.length(); j++) {
                if (!set.contains(word.charAt(j))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans++;
            }
        }
        return ans;
    }
}
