package com.darkgo.primary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * 滑动窗口
 * 通过HashSet保存不重复字符，如果重复，窗口向下滑动，并统计set中保存的字符数
 * 时间复杂度O(n)
 * 空间复杂度O(E) E代表出现的字符数
 */
public class LeetCode3 {
    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0, j = 0; i < chars.length; i++) {
            while (set.contains(chars[i])) {
                set.remove(chars[j++]);
            }
            set.add(chars[i]);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    private static int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                j = Math.max(map.get(chars[i]) + 1, j);
            }
            max = Math.max(max, i - j + 1);
            map.put(chars[i], i);
        }
        return max;
    }
}
