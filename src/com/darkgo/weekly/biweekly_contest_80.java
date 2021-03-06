package com.darkgo.weekly;

import java.util.*;

/**
 * <p>
 * 80双周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/11
 */
public class biweekly_contest_80 {
    public static void main(String[] args) {
        // int[] spells = {5, 1, 3};
        // int[] potions = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(successfulPairs(spells, potions, 7)));
        String s = "fool3e7bar";
        String sub = "leet";
        char[][] mappings = {{'e', '3'}, {'t', '7'}, {'t', '8'}};
        System.out.println(matchReplacement(s, sub, mappings));
    }

    private boolean strongPasswordCheckerII(String password) {
        int length = password.length();
        if (length < 8) {
            return false;
        }
        boolean lowercase = false;
        boolean uppercase = false;
        boolean num = false;
        boolean special = false;
        String s = "!@#$%^&*()-+";
        char c = password.charAt(0);
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (Character.isLowerCase(aChar)) {
                lowercase = true;
            }
            if (Character.isUpperCase(aChar)) {
                uppercase = true;
            }
            if (Character.isDigit(aChar)) {
                num = true;
            }
            for (int j = 0; j < s.length(); j++) {
                if (aChar == s.charAt(j)) {
                    special = true;
                    break;
                }
            }
            if (i != 0 && aChar == c) {
                return false;
            } else if (i != 0) {
                c = aChar;
            }
        }
        return lowercase && uppercase && num && special;
    }

    private static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int length = spells.length;
        int[] ans = new int[length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int start = 0, end = potions.length;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if ((long) potions[mid] * spells[i] >= success) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            ans[i] = potions.length - start;
        }
        return ans;
    }

    private static boolean matchReplacement(String s, String sub, char[][] mappings) {
        HashMap<Character, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < mappings.length; i++) {
            char c = mappings[i][0];
            Set<Character> set = map.getOrDefault(c, new HashSet<>());
            set.add(mappings[i][1]);
            map.put(c, set);
        }
        int m = sub.length();
        for (int i = 0; i + m - 1 < s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                char c = s.charAt(i + j);
                if (c == sub.charAt(j)) {
                    continue;
                }
                if (!map.containsKey(sub.charAt(j))) {
                    flag = false;
                    break;
                }
                if (!map.get(sub.charAt(j)).contains(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    private long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int left = i, right = nums.length - 1;
            while (left < right) {
                int mid = (right - left) / 2;
            }
        }
        return sum;
    }
}
