// Last updated: 7/9/2026, 3:06:00 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int m = edges.length;
        for (int i = 0; i < m; i++) {
            int sv = edges[i][0];
            int ev = edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        return bfs(n, source, destination, adj);
    }
    static boolean bfs(int n, int source, int destination, List<List<Integer>> adj) {

        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = true;
        while (q.size()>0) {
            int curr = q.poll();

            if (curr == destination) return true;
            int m = adj.get(curr).size();
            for (int i=0;i<m;i++) {
                int x = adj.get(curr).get(i);
                if (vis[x]==false) {
                    q.add(x);
                    vis[x] = true;
                }
            }
        }

        return false;
    }
}