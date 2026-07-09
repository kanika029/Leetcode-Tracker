// Last updated: 7/9/2026, 3:07:35 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                c++;
                bfs(i,isConnected,vis);
            }
        }
        return c;
    }
    void bfs(int sv,int[][] isConnected, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        vis[sv] =true;
        while(q.size()>0){
            int curr = q.poll();
            int m =isConnected.length;
            for (int i=0;i<m;i++) {
                int x = isConnected[curr][i];
                if (x == 1) {
                    if (!vis[i]) {
                        q.add(i);
                        vis[i] = true;
                    }
                }
            }
        }

    }
}