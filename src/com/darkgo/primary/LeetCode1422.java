package com.darkgo.primary;

/**
 * <p>
 * 分割字符串的最大得分
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/14
 */
public class LeetCode1422 {
    private int maxScore(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int left = 0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i] == '0'){
                left++;
            }
            int right = 0;
            for(int j = i+1;j<chars.length;j++){
                if(chars[j]=='1'){
                    right++;
                }
            }
            max = Math.max(left+right,max);
        }
        return max;
    }
}
