package com.darkgo.offer;

/**
 * <p>
 * 替换空格
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/11
 */
public class Offer05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
    private static String replaceSpace(String s) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isSpaceChar(s.charAt(i))) {
                buffer.append(s.charAt(i));
            } else {
                buffer.append("%20");
            }

        }
        return buffer.toString();
    }
}
