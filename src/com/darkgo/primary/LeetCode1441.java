package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/15
 */
public class LeetCode1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i == target[index]) {
                list.add("Push");
                index++;
                if (index == target.length) {
                    break;
                }
            } else {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
