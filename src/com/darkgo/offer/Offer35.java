package com.darkgo.offer;

import java.util.HashMap;

/**
 * <p>
 * 复杂链表的复制
 * </p>
 *
 * @author ShiWu
 * @since 2022/5/10
 */
public class Offer35 {
    public static void main(String[] args) {

    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static HashMap<Node, Node> map = new HashMap<>();

    private static Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node next = new Node(head.val);
        map.put(head,next);
        head = copyRandomList(next);
        head.random=map.get(head.random);
        return head;
    }
}
