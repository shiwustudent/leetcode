package com.darkgo.offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 用两个栈实现队列
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/9
 */
public class Offer09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }

    private static class CQueue {
        Deque<Integer> inStack;
        Deque<Integer> outStack;

        public CQueue() {
            inStack = new ArrayDeque<>();
            outStack = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            if (outStack.isEmpty()) {
                if (inStack.isEmpty()) {
                    return -1;
                }
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            return outStack.pop();
        }
    }
}
