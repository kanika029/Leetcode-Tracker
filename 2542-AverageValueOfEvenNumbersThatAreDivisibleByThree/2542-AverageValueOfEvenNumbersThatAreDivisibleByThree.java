// Last updated: 7/9/2026, 3:05:54 PM
class Solution {
    public int averageValue(int[] nums) {
        int s = 0;
        int count=0;
        for (int i:nums){
            if(i%2==0 && i%3==0){
                s+=i;
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return s/count;
    }
}