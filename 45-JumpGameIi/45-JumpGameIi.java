// Last updated: 7/9/2026, 3:10:25 PM
class Solution {
        public int jump(int[] nums) {
        int jumps = 0;
      
        int maxReachable = 0;
      
        int currentJumpEnd = 0;
      
        for (int i = 0; i < nums.length - 1; i++) {
            maxReachable = Math.max(maxReachable, i + nums[i]);
          
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = maxReachable;
            }
        }
      
        return jumps;
    }
}