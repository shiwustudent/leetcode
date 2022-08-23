package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * 前K个高频单词
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/20
 */
public class LeetCode692 {
    //method 1 map+sort
    private List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        list.sort((o1, o2) -> Objects.equals(map.get(o1), map.get(o2)) ? o1.compareTo(o2) : map.get(o2) - map.get(o1));
        return list.subList(0, k);
    }

    //method 2 priority queue
    private List<String> topKFrequent2(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() == o2.getValue() ? o1.getKey().compareTo(o2.getKey()) : o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
}
