// Last updated: 7/9/2026, 3:07:48 PM
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinct = 1;
        int last=nums[nums.length-1];
        for(int i=nums.length-2;i>=0; i--) {
            if (nums[i] != last) {
                distinct++;
                last = nums[i];
            }
            if (distinct == 3) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}