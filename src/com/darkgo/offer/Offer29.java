package com.darkgo.offer;

/**
 * <p>
 * 排序的循环链表
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/18
 */
public class Offer29 {
    public static void main(String[] args) {

    }

    private class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    ;

    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);
        if (head == null) {
            head = node;
            return head;
        }
        if (head.next == head) {
            head.next = node;
            node.next = head;
            return head;
        }
        Node curr = head, next = head.next;
        while (head != next) {
            if (insertVal >= curr.val && insertVal <= next.val) {
                break;
            }
            if (curr.val > next.val) {
                if (insertVal > curr.val || insertVal <= next.val) {
                    break;
                }
            }
            curr = curr.next;
            next = next.next;
        }
        return head;
    }
}
