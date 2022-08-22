package com.darkgo.primary;

import java.util.Arrays;

/**
 * <p>
 * 有序队列
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/21
 */
public class LeetCode899 {
    private String orderlyQueue(String s, int k) {
        if (k == 1) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length(); i++) {
                sb.append(sb.charAt(0)).deleteCharAt(0);
                if (sb.toString().compareTo(s) < 0) {
                    s = sb.toString();
                }
            }
            return sb.toString();
        } else {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return String.valueOf(chars);
        }
    }
}
