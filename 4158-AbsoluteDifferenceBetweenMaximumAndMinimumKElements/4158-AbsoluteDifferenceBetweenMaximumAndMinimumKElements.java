// Last updated: 7/9/2026, 3:05:16 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int mins = 0 , max = 0;
        for(int i =0;i<k;i++){
            mins+=nums[i];
            max+=nums[nums.length-1-i];
        }
        return Math.abs(max-mins);
    }
}