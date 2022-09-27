package com.darkgo.interview;

import java.util.Arrays;

/**
 * <p>
 * 判定是否互为字符重排
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/27
 */
public class Interview0102 {
    private boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars1.length != chars2.length) {
            return false;
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
