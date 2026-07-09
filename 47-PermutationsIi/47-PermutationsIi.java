// Last updated: 7/9/2026, 3:10:23 PM
import java.util.*;

public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    private void helper(int[] nums, int i, List<List<Integer>> ans) {

        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        Set<Integer> set = new HashSet<>();

        for (int j = i; j < nums.length; j++) {

            if (set.contains(nums[j])) {
                continue;
            }

            set.add(nums[j]);

            swap(nums, i, j);
            helper(nums, i + 1, ans);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}