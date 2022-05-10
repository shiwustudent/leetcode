package com.darkgo.offer;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/**
 * <p>
 * 包含min函数的栈
 * </p>
 * 添加辅助栈，O(1)的时间复杂度求最小值
 * @author ShiWu
 * @since 2022/5/9
 */
public class Offer30 {
    public static void main(String[] args) {

    }

    private static class MinStack {

        Deque<Integer> stack;
        Deque<Integer> minStack;


        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new ArrayDeque<>();
            minStack = new ArrayDeque<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            minStack.push(Math.min(x, minStack.peek()));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
