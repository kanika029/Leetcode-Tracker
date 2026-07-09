// Last updated: 7/9/2026, 3:10:18 PM
class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i =0; i<n ;i++){
            if( currentSum < 0){
                currentSum = nums[i];
            }else{
                currentSum +=nums[i];
            }
            
            if( currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
        
    }
} 