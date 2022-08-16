package com.darkgo.primary;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>
 * 设计循环双端队列
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/15
 */
public class LeetCode641 {
    private class MyCircularDeque {
        private Deque<Integer> queue;
        private int size;

        public MyCircularDeque(int k) {
            queue = new LinkedList<>();
            size = k;
        }

        public boolean insertFront(int value) {
            if (queue.size() >= size) {
                return false;
            }
            queue.addFirst(value);
            return true;
        }

        public boolean insertLast(int value) {
            if (queue.size() >= size) {
                return false;
            }
            queue.addLast(value);
            return true;
        }

        public boolean deleteFront() {
            if (!queue.isEmpty()) {
                queue.removeFirst();
                return true;
            } else {
                return false;
            }
        }

        public boolean deleteLast() {
            if (!queue.isEmpty()) {
                queue.removeLast();
                return true;
            } else {
                return false;
            }
        }

        public int getFront() {
            if (!queue.isEmpty()) {
                return queue.getFirst();
            } else {
                return -1;
            }
        }

        public int getRear() {
            if (!queue.isEmpty()) {
                return queue.getLast();
            } else {
                return -1;
            }
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public boolean isFull() {
            return queue.size() == size;
        }
    }
}
