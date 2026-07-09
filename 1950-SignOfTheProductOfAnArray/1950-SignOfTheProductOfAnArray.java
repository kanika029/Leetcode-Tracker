// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public int arraySign(int[] nums) {
        int neg =0;
        for(int i:nums){
            if(i==0) return 0;
            if(i<0) neg++;
        }
        return (neg%2==0)? 1:-1;
    }
}