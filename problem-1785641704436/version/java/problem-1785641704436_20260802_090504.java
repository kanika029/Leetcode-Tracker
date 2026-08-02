// Last updated: 8/2/2026, 9:05:04 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        int n = nums.length;
4        long m=0;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                long g = gcd(nums[i],nums[j]);
8                long s= (1L*nums[i]*nums[j])/(g*g);
9                m = Math.max(m,s);
10            }
11        }
12        return m;
13    }
14    private int gcd(int a,int b){
15        return b==0?a:gcd(b,a%b);
16    }
17}