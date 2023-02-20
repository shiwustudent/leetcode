package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/20
 */
public class LeetCode2347 {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;
        char color = suits[0];
        for (char suit : suits) {
            if (suit != color) {
                flush = false;
            }
        }
        if (flush) {
            return "Flush";
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int rank : ranks) {
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }
        if (map.size() == 5) {
            return "High Card";
        }
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() > 2) {
                return "Three of a Kind";
            }
        }
        return "Pair";
    }
}
