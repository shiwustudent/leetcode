package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/7
 */
public class LeetCode1604 {
    private List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> ans = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        int n = keyName.length;
        for (int i = 0; i < n; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            String[] split = time.split(":");
            int hour = Integer.parseInt(split[0]);
            int minute = Integer.parseInt(split[1]);
            List<Integer> value = map.getOrDefault(name, new ArrayList<>());
            value.add(hour * 60 + minute);
            map.put(name, value);
        }
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            Collections.sort(value);
            for (int i = 2; i < value.size(); i++) {
                int time1 = value.get(i - 2), time2 = value.get(i);
                int difference = time2 - time1;
                if (difference <= 60) {
                    ans.add(entry.getKey());
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
