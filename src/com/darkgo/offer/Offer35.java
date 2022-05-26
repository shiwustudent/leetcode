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
        if (!map.containsKey(head)) {
            Node node = new Node(head.val);
            map.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }
        return map.get(head);
    }
}
