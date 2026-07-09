// Last updated: 7/9/2026, 3:05:21 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sds = 0;
        int dds = 0;
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            int num =  nums[i];
            sum+=num;
            if (num <10){
                sds+=num;
            }else{
                dds+=num;
            }
        }
        if (sds > sum - sds){
            System.out.printf("Alice can win by choosing single-digit numbers which have a sum equal to %d.",sds);
            return true;
        }
        if (dds > sum - dds){
            System.out.printf("Alice can win by choosing double-digit numbers which have a sum equal to %d.",dds);
            return true;
        }
        System.out.println("Alice cannot win by choosing either single-digit or double-digit numbers.");
        return false;
    }
    
}