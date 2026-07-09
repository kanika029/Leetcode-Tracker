// Last updated: 7/9/2026, 3:06:24 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}