// Last updated: 7/9/2026, 3:08:20 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        // Populate the left array (moving left to right)
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                left[i] = nums[i]; // Block start
            } else {
                left[i] = Math.max(left[i - 1], nums[i]);
            }
        }

        // Populate the right array (moving right to left)
        for (int j = n - 1; j >= 0; j--) {
            if ((j + 1) % k == 0 || j == n - 1) {
                right[j] = nums[j]; // Block end or array end
            } else {
                right[j] = Math.max(right[j + 1], nums[j]);
            }
        }

        // Build the result array
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            ans[i] = Math.max(right[i], left[i + k - 1]);
        }

        return ans;
    }
}
