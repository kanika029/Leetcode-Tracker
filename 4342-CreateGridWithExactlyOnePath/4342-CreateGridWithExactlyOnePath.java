// Last updated: 7/9/2026, 3:05:13 PM
class Solution {
    public String[] createGrid(int m, int n) {
        String[] g = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder r = new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==0||j==n-1)
                    r.append('.');
                else
                    r.append('#');
            }
            g[i]=r.toString();
        }
        return g;
    }
}