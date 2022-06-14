package com.darkgo.primary;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 * 387. 字符串中的第一个唯一字符
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/3
 */
public class LeetCode387 {
    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
    private static int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            int cnt= map.getOrDefault(c,0);
            map.put(c,cnt+1);
        }
        char c = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }
        }
        if (c == ' ') {
            return -1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
