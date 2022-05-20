package com.darkgo.offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 * 第一个只出现一次的字符
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/19
 */
public class Offer50 {
    public static void main(String[] args) {

    }
    private char firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        char ans = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                ans = entry.getKey();
                return ans;
            }
        }
        return ans;
    }
}
