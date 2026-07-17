// Last updated: 7/17/2026, 9:44:44 AM
1class Solution {
2    public int maxPoints(int[][] points) {
3        int n = points.length;
4        if(n <= 2) return n;
5        int ans = 2;
6        
7        for(int i = 0 ;i < n; i++){
8            for(int j = i+1; j < n ; j++){
9                int temp = 2;
10                for(int k = j+1 ; k<n ; k++ ){      
11                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
12                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
13                    if(x == y){
14                        temp++;
15                    }
16                }
17                if(temp > ans){
18                    ans = temp;
19                }
20            }
21        }   
22        return ans;
23    }
24}