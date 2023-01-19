package com.darkgo.primary;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/19
 */
public class LeetCode2299 {
    public static void main(String[] args) {
        strongPasswordCheckerII("IloveLe3tcode!");
    }
    private static boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean sep = false;
        boolean repeat = true;
        Set<Character> set = new HashSet<>();
        set.add('!');
        set.add('@');
        set.add('#');
        set.add('$');
        set.add('%');
        set.add('^');
        set.add('&');
        set.add('*');
        set.add('(');
        set.add(')');
        set.add('-');
        set.add('+');
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upper = true;
            }
            if (Character.isLowerCase(c)) {
                lower = true;
            }
            if (Character.isDigit(c)) {
                digit = true;
            }
            if (i != 0 && c == password.charAt(i - 1)) {
                repeat = false;
            }
            if (set.contains(c)) {
                sep = true;
            }
        }
        return lower && upper && digit && sep && repeat;
    }
}
