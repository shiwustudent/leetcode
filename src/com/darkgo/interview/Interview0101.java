package com.darkgo.interview;

/**
 * <p>
 * 判定字符是否唯一
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/24
 */
public class Interview0101 {
    private boolean isUnique(String astr) {
        int[] cnt = new int[26];
        char[] chars = astr.toCharArray();
        for (char c : chars) {
            cnt[c - 'a']++;
            if (cnt[c - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isUnique1(String astr) {
        char[] chars = astr.toCharArray();
        int mark = 0;
        for (char c : chars) {
            int move_bit = c - 'a';
            if ((mark & 1 << move_bit) != 0) {
                return false;
            } else {
                mark |= (1 << move_bit);
            }
        }
        return true;
    }
}
