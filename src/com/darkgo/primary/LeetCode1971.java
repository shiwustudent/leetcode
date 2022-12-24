package com.darkgo.primary;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2022/12/19
 */
public class LeetCode1971 {
    public static void main(String[] args) {
        int n = 3, source = 0, destination = 2;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        validPath(n, edges, source, destination);
    }

    /**
     * 广度优先
     *
     * @param n
     * @param edges
     * @param source
     * @param destination
     * @return
     */
    private static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (vertex == destination) {
                return true;
            }
            for (Integer next : adj[vertex]) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
        return visited[destination];
    }

    /**
     * 深度优先
     *
     * @param n
     * @param edges
     * @param source
     * @param destination
     * @return
     */
    private boolean validPath2(int n, int[][] edges, int source, int destination) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean[] visited = new boolean[n];

        return dfs(source, destination, adj, visited);
    }

    private boolean dfs(int source, int destination, List<Integer>[] adj, boolean[] visited) {
        if (source == destination) {
            return true;
        }
        visited[source] = true;
        for (Integer integer : adj[source]) {
            if (!visited[integer] && dfs(integer, destination, adj, visited)) {
                return true;
            }
        }
        return false;
    }
}
