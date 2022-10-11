package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 仅执行一次字符串交换能否使两个字符串相等
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/11
 */
public class LeetCode1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int dif = 0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                dif++;
                list.add(i);
            }
            if (dif > 2) {
                return false;
            }
        }
        if (dif == 0) {
            return true;
        }
        return dif == 2 && chars1[list.get(0)] == chars2[list.get(1)] && chars1[list.get(1)] == chars2[list.get(0)];

    }
}
