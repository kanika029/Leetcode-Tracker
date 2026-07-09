// Last updated: 7/9/2026, 3:07:01 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                return nums[i];
            }else{
                h.add(nums[i]);
            }
        }
        return -1;
    }
}