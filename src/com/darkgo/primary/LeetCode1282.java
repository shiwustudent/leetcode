package com.darkgo.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户分组
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/12
 */
public class LeetCode1282 {
    public static void main(String[] args) {
        groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3});
    }
    private static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> list = map.getOrDefault(groupSize, new ArrayList<>());
            list.add(i);
            map.put(groupSize, list);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            Integer key = entry.getKey();
            if (value.size() != key) {
                int n = value.size() / key;
                for (int i = 0; i < n; i++) {
                    List<Integer> list = value.subList(i * key, i * key + key);
                    ans.add(list);
                }
            } else {
                ans.add(value);
            }
        }
        return ans;
    }
}
