package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/1
 */
public class LeetCode71 {
    private String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] names = path.split("/");
        for (String name : names) {
            System.out.println(name);
            if (".".equals(name) || "".equals(name)) {
            } else if ("..".equals(name)) {
                if (stack.size() > 0) {
                    stack.pop();
                }
            } else {
                stack.push(name);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
            sb.append("/");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
