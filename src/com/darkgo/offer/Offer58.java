package com.darkgo.offer;

/**
 * <p>
 * 左旋转字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/11
 */
public class Offer58 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords(s, k));
    }

    private static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
