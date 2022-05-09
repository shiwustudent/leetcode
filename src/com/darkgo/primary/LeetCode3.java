package com.darkgo.primary;

import java.util.HashSet;

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

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            set.clear();
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else {
                    max = Math.max(max, set.size());
                    break;
                }
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
