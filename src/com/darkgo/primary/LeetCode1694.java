package com.darkgo.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 重新格式化电话号码
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/1
 */
public class LeetCode1694 {
    public String reformatNumber(String number) {
        char[] chars = number.toCharArray();
        StringBuilder digits = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        int n = digits.length();
        int index = 0;
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            if (n > 4) {
                ans.append(digits.substring(index, index + 3) + "-");
                index += 3;
                n -= 3;
            } else {
                if (n == 4) {
                    ans.append(digits.substring(index, index + 2) + "-" + digits.substring(index + 2, index + 4));
                } else {
                    ans.append(digits.substring(index, n));
                }
                break;
            }
        }
        return ans.toString();

    }
}
