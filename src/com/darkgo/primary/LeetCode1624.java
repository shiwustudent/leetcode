package com.darkgo.primary;

import java.util.HashMap;

/**
 * <p>
 * 两个相同字符之间的最长子字符串
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/17
 */
public class LeetCode1624 {
    private int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        char[] chars = s.toCharArray();
        int ans = -1;
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                ans = Math.max(ans,i-map.get(chars[i])-1);
            }else{
                map.put(chars[i],i);
            }
        }
        return ans;
    }
}
