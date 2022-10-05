package com.darkgo.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 子域名访问计数
 * </p>
 *
 * @author ShiWu
 * @since 2022/10/5
 */
public class LeetCode811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] split = s.split(" ");
            int count = Integer.parseInt(split[0]);
            String[] domain = split[1].split("\\.");
            StringBuilder sb = new StringBuilder();
            for (int i = domain.length - 1; i >= 0; i--) {
                if (i == domain.length - 1) {
                    sb.append(domain[i]);
                } else {
                    sb.insert(0, domain[i] + ".");
                }
                map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + count);
            }
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            ans.add(value+" "+key);
        }
        return ans;
    }
}
