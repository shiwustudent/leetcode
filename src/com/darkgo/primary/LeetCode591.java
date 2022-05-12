package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 标签验证器
 * </p>
 * 字符串操作
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 *
 * @author ShiWu
 * @since 2022/5/2
 */
public class LeetCode591 {
    public static void main(String[] args) {
        String code =         "<DIV>This is the first line <![CDATA[<div>]]><DIV>";
        System.out.println(isValid(code));
    }

    private static boolean isValid(String code) {
        int n = code.length();
        Deque<String> tags = new ArrayDeque<>();
        int i = 0;
        while (i < n) {
            if (code.charAt(i) == '<') {
                if (i == n - 1) {
                    return false;
                }
                if (code.charAt(i + 1) == '/') {
                    int j = code.indexOf('>', i);
                    if (j < 0) {
                        return false;
                    }
                    String tagName = code.substring(i + 2, j);
                    //peek查看首个，不删除
                    if (tags.isEmpty() || !tags.peek().equals(tagName)) {
                        return false;
                    }
                    //删除相同的tag
                    tags.pop();
                    i = j + 1;
                    if (tags.isEmpty() && i != n) {
                        return false;
                    }
                } else if (code.charAt(i + 1) == '!') {
                    if (tags.isEmpty()) {
                        return false;
                    }
                    if (i + 9 > n) {
                        return false;
                    }
                    String cdata = code.substring(i + 2, i + 9);
                    if (!"[CDATA[".equals(cdata)) {
                        return false;
                    }
                    int j = code.indexOf("]]>", i);
                    if (j < 0) {
                        return false;
                    }
                    i = j + 1;
                } else {
                    int j = code.indexOf(">", i);
                    if (j < 0) {
                        return false;
                    }
                    String tagName = code.substring(i + 1, j);
                    if (tagName.length() < 1 || tagName.length() > 9) {
                        return false;
                    }
                    for (int k = 0; k < tagName.length(); k++) {
                        if (!Character.isUpperCase(tagName.charAt(k))) {
                            return false;
                        }
                    }
                    tags.push(tagName);
                    i = j + 1;
                }
            } else {
                if (tags.isEmpty()) {
                    return false;
                }
                ++i;
            }
        }
        return tags.isEmpty();
    }
}
