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
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(successfulPairs(spells, potions, 7)));
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
            int start = 0, end = potions.length - 1;
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

    public boolean matchReplacement(String s, String sub, char[][] mappings) {
        char[] chars = sub.toCharArray();
        for (int i = 0; i < mappings.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == mappings[i][0]) {
                    StringBuilder builder = new StringBuilder(sub);
                    builder.replace(j, j, String.valueOf(mappings[i][1]));
                    if (s.contains(builder.toString())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
