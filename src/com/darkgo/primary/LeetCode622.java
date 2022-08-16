package com.darkgo.primary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>
 * 设计循环队列
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/2
 */
public class LeetCode622 {
    private class MyCircularQueue {
        int[] nums;
        int capaticy;
        int front = 0, rear = 0;

        public MyCircularQueue(int k) {
            capaticy = k + 1;
            nums = new int[capaticy];
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            nums[rear] = value;
            rear = (rear + 1) % capaticy;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % capaticy;
            return true;
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return nums[front];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return nums[(rear - 1 + capaticy) % capaticy];
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public boolean isFull() {
            return (rear + 1) % capaticy == front;
        }
    }
}
