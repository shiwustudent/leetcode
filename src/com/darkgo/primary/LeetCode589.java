package com.darkgo.primary;

import java.util.*;

/**
 * <p>
 * N 叉树的前序遍历
 * </p>
 *
 * @author ShiWu
 * @since 2022/8/13
 */
public class LeetCode589 {
    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    private List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        order(root, ans);
        return ans;
    }

    private void order(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        List<Node> children = node.children;
        for (Node child : children) {
            order(child, list);
        }
    }
}
