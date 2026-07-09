// Last updated: 7/9/2026, 3:09:09 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int m = n / 2;
        
        for (Map.Entry<Integer, Integer> en : map.entrySet()) { 
            if (en.getValue() > m) {
                return en.getKey();
            }
        }
        
        return 0;
    }
}