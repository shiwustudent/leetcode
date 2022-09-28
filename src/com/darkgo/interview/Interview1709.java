package com.darkgo.interview;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * <p>
 * 第 k 个数
 * </p>
 *  //TODO dp
 * @author ShiWu
 * @since 2022/9/28
 */
public class Interview1709 {
    private int getKthMagicNumber(int k) {
        int[] factors = {3, 5, 7};
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        seen.add(1L);
        heap.add(1L);
        int magic = 0;
        for (int i = 0; i < k; i++) {
            long poll = heap.poll();
            magic = (int) poll;
            for (int factor : factors) {
                long next = poll * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return magic;
    }
}
