package com.darkgo.primary;

/**
 * <p>
 * 删除字符串两端相同字符后的最短长度
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/28
 */
public class LeetCode1750 {
    public static void main(String[] args) {
        minimumLength("aaaa");
    }
    private  static int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char c = s.charAt(left);
            while (left <= right && s.charAt(left)==c) {
                left++;
            }
            while (left <= right && s.charAt(right) == c) {
                right--;
            }
        }
        return right - left + 1;
    }
}
