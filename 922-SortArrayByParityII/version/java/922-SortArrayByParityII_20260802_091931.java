// Last updated: 8/2/2026, 9:19:31 AM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int i = 0, j = 1, n = nums.length;
4        while (i < n && j < n) {
5            if(nums[i] % 2 == 0) i+=2;
6            else if (nums[j] % 2 == 1) j+=2;
7            else {
8                int temp = nums[i];
9                nums[i] = nums[j];
10                nums[j] = temp;
11                i += 2;
12                j += 2;
13            }
14        }
15        return nums;
16    }
17}