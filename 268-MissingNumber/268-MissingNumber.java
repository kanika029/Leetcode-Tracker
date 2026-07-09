// Last updated: 7/9/2026, 3:08:13 PM
class Solution {
    public int missingNumber(int[] nums) {
    int n =nums.length;
    int r = n*(n+1)/2;
    int s = 0;
    for( int i : nums){
        s+=i;
    }
    return r-s;
    }
}