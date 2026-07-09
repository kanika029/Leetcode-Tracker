// Last updated: 7/9/2026, 3:05:24 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count =0;
        for(int i:nums){
            if(i%3!=0){
                count++;
            }
        }
        return count;
    }
}