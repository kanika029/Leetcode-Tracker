// Last updated: 7/17/2026, 9:49:43 AM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3       int n = dimensions.length;
4        int maxArea = 0, maxDiag = 0;
5
6        for (int i = 0; i < n; i++) {
7            int l = dimensions[i][0];
8            int w = dimensions[i][1];
9            int currDiag = l * l + w * w;
10
11            if (currDiag > maxDiag || (currDiag == maxDiag && l * w > maxArea)) {
12                maxDiag = currDiag;
13                maxArea = l * w;
14            }
15        }
16        return maxArea; 
17    }
18}