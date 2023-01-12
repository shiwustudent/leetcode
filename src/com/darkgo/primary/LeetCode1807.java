package com.darkgo.primary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/12
 */
public class LeetCode1807 {
    private String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String> words:knowledge){
            map.put(words.get(0),words.get(1));
        }
        StringBuilder sb = new StringBuilder();
        boolean add = true;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '(') {
                add = false;
            }
            if (add) {
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                int k = i;
                while (s.charAt(k) != '(') {
                    k--;
                }
                String key = s.substring(k + 1, i);
                String value = map.getOrDefault(key, "?");
                sb.append(value);
                add = true;
            }
        }
        return sb.toString();
    }
}
