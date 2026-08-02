// Last updated: 8/2/2026, 9:18:44 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4        for (int i = 0; i < k; i++) {
5            sum += nums[i];
6        }
7
8        int maxSum = sum;
9
10        for (int i = k; i < nums.length; i++) {
11            sum += nums[i] - nums[i - k]; 
12            maxSum = Math.max(maxSum, sum);
13        }
14
15        return (double) maxSum / k;
16    }
17}