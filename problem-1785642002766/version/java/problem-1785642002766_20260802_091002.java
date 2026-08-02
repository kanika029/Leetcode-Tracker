// Last updated: 8/2/2026, 9:10:02 AM
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3        int[]  n = nums;
4        int l = n.length;
5        int ans =0;
6        for(int i=0;i<l;i++){
7            int od=0 , ev=0;
8            for(int j=i;j<l;j++){
9                if(n[j]%2==0){
10                    ev++;
11                }else{
12                    od++;
13                }
14                if(od>0 && (long) ev*b<=(long) od*a){
15                    ans++;
16                }
17                
18            }
19            
20        }
21        return ans;
22    }
23}