// Last updated: 8/2/2026, 9:31:04 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        int max = nums[0], min = nums[0], ans = nums[0];
5        
6        for (int i = 1; i < nums.length; i++) {
7            
8            int temp = max; 
9            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
10            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
11            
12            if (max > ans) {
13                ans = max;
14            }
15        }
16        
17        return ans;
18
19    }
20}