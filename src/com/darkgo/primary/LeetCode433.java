package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * <p>
 * 最小基因变化
 * </p>
 * BFS
 * 初始化Queue
 * @author ShiWu
 * @since 2022/5/7
 */
public class LeetCode433 {
    public static void main(String[] args) {
        String start = "AACCGGTT", end = "AAACGGTA";
        String[] bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        System.out.println(minMutation(start, end, bank));
    }

    private static int minMutation(String start, String end, String[] bank) {
        Set<String> cnt = new HashSet<>();
        Set<String> visited = new HashSet<>();
        char[] keys = {'A', 'C', 'G', 'T'};
        for (String s : bank) {
            cnt.add(s);
        }
        if (start.equals(end)) {
            return 0;
        }
        if (!cnt.contains(end)) {
            return -1;
        }
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(start);
        visited.add(start);
        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (keys[k] != current.charAt(j)) {
                            StringBuffer sb = new StringBuffer(current);
                            sb.setCharAt(j, keys[k]);
                            String next = sb.toString();
                            if (!visited.contains(next) && cnt.contains(next)) {
                                if (next.equals(end)) {
                                    return step;
                                }
                                queue.offer(next);
                                visited.add(next);
                            }
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
