package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * <p>
 * 函数的独占时间
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/7
 */
public class LeetCode636 {
    public static void main(String[] args) {

    }

    private int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();
        for (String log : logs) {
            int id = Integer.parseInt(log.substring(0, log.indexOf(":")));
            String type = log.substring(log.indexOf(":") + 1, log.lastIndexOf(":"));
            int timestamp = Integer.parseInt(log.substring(log.lastIndexOf(":") + 1));
            if ("start".equals(type)) {
                if (!stack.isEmpty()) {
                    ans[stack.peek()[0]] += timestamp - stack.peek()[1];
                    stack.peek()[1] = timestamp;
                }
                stack.push(new int[]{id, timestamp});
            } else {
                int[] pop = stack.pop();
                ans[pop[0]] += timestamp - pop[1] + 1;
                if (!stack.isEmpty()) {
                    stack.peek()[1] = timestamp + 1;
                }
            }
        }
        return ans;
    }
}
