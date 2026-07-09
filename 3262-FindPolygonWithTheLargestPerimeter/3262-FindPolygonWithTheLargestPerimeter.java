// Last updated: 7/9/2026, 3:05:28 PM
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);  
        long Csum = 0, Psum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < Csum) {
                Psum = Csum + nums[i];
            }
            Csum += nums[i];
        }
        return (Psum == 0) ? -1 : Psum;
    }
}