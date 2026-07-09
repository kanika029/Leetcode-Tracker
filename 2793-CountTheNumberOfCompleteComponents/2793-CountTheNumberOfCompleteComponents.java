// Last updated: 7/9/2026, 3:05:41 PM
class Solution {
    int ans = 0;

    public int countCompleteComponents(int n, int[][] e) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < e.length; i++) {
            adj[e[i][0]].add(e[i][1]);
            adj[e[i][1]].add(e[i][0]);
        }
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i]==false) {
                BFS(adj, vis, i);
            }
        }
        return ans;
    }
    void BFS(List<Integer>[] adj, boolean[] vis, int src) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        int nodecount = 0;
        int edgecount = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            nodecount++;
            for (int x : adj[node]) {
                edgecount++;   

                if (!vis[x]) {
                    q.add(x);
                    vis[x] = true;
                }
            }
        }
        if ((long) nodecount * (nodecount - 1) == edgecount) {
            ans++;
        }
    }
}