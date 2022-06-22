package com.darkgo.primary;

import java.util.Stack;

/**
 * <p>
 * 用栈实现队列
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/22
 */
public class LeetCode232 {
    public static void main(String[] args) {

    }
    private class MyQueue {
        Stack<Integer>  stack1;
        Stack<Integer>  stack2;
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }
            if (stack1.isEmpty()) {
                return -1;
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                for (Integer integer : stack1) {
                    stack2.push(integer);
                }
                return stack2.pop();
            }
        }

        public int peek() {
            if (!stack2.isEmpty()) {
                return stack2.peek();
            }
            if (stack1.isEmpty()) {
                return -1;
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.peek();
            }
        }

        public boolean empty() {
            return stack2.isEmpty() && stack1.empty();
        }
    }
}
