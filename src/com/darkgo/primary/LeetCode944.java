package com.darkgo.primary;

/**
 * <p>
 * 删列造序
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/12
 */
public class LeetCode944 {
    public static void main(String[] args) {
        String[] strs = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(strs));
    }

    private static int minDeletionSize(String[] strs) {
        int length = strs[0].length();
        int ans = 0;
        for (int i = 0; i < length; i++) {
            char temp = 'a';
            for (String str : strs) {
                if (str.charAt(i) >= temp) {
                    temp = str.charAt(i);
                } else {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
