package com.darkgo.weekly;

import com.darkgo.primary.LeetCode208;

import java.util.*;

/**
 * <p>
 * 第 311 场周赛
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/18
 */
public class weekly_contest_311 {
    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abacaba"));
    }

    private static int longestContinuousSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 1;
        int ans = 1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i + 1] - chars[i] == 1) {
                max++;
                ans = Math.max(max, ans);
            } else {
                max = 1;
            }
        }
        return ans;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // 修改节点值
    private TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0;
        List<List<Integer>> allData = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    if (level % 2 == 0) {
                        list.add(node.left.val);
                    }
                    queue.add(node.left);
                }
                if (node.right != null) {
                    if (level % 2 == 0) {
                        list.add(node.right.val);
                    }
                    queue.add(node.right);
                }
            }
            if (level % 2 == 0) {
                Collections.reverse(list);
                allData.add(list);
            }
            level++;
        }
        System.out.println(allData);
        queue.offer(root);
        level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    if (level % 2 == 0) {
                        node.left.val = allData.get(level).get(i);
                    }
                    queue.add(node.left);
                }
                if (node.right != null) {
                    if (level % 2 == 0) {
                        node.right.val = allData.get(level).get(i);
                    }
                    queue.add(node.right);
                }
            }
            level++;
        }
        return root;
    }

    // 递归
    private TreeNode reverseOddLevels2(TreeNode root) {
        dfs(root.left, root.right, 0);
        return root;
    }

    private void dfs(TreeNode left, TreeNode right, int level) {
        if (left == null) {
            return;
        }
        if (level % 2 != 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        dfs(left.left, right.right, level+1);
        dfs(right.left, left.right, level+1);
    }

    private int[] sumPrefixScores(String[] words) {
        int n = words.length;
        Trie trie = new Trie();
        for (int i = 0; i < n; i++) {
            trie.insert(words[i]);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = trie.calCnt(words[i]);
            ans[i] = cnt;
        }
        return ans;
    }

    class Trie {
        Trie[] children;
        boolean isEnd;
        int cnt = 0;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }

        public void insert(String word) {
            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
                node.children[index].cnt++;
            }
            node.isEnd = true;
        }

        public int calCnt(String word) {
            Trie node = this;
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (node.children[index] != null) {
                    sum += node.children[index].cnt;
                }
                node = node.children[index];
            }
            return sum;
        }

        public boolean search(String word) {
            Trie trie = searchPrefix(word);
            return trie != null && trie.isEnd;
        }

        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

        public Trie searchPrefix(String prefix) {
            Trie node = this;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                int index = c - 'a';
                if (node.children[index] == null) {
                    return null;
                }
                node = node.children[index];
            }
            return node;
        }
    }


}
