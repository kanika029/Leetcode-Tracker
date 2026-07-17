// Last updated: 7/17/2026, 9:49:05 AM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        for (int i = 0, j = 0; j < nums.length; j++)
4            if (nums[j] % 2 == 0) {
5                int tmp = nums[i];
6                nums[i++] = nums[j];
7                nums[j] = tmp;;
8            }
9        return nums;
10    }
11}