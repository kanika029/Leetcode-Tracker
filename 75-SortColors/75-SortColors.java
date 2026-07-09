// Last updated: 7/9/2026, 3:10:03 PM
class Solution {
    public void sortColors(int[] nums) {
        int zi = 0, ti = nums.length - 1;
        int i = 0;
        while (i <= ti) {
            if (nums[i] == 0) {
                int t = nums[zi];
                nums[zi] = 0;
                nums[i] = t;
                zi++;
                i++;
            } 
            else if (nums[i] == 1) i++;
            else {
                int t = nums[ti];
                nums[ti] = 2;
                nums[i] = t;
                ti--;
            }
        }
    }
}
