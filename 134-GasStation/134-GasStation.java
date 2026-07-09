// Last updated: 7/9/2026, 3:09:33 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0,rem=0,ans =0;
        for(int i=0;i<gas.length;i++){
            tot += gas[i] - cost[i];
            rem += gas[i] - cost[i];
            if (rem<0){
                ans = i+1;
                rem = 0;
            }
            
        }
        return tot >= 0?ans:-1;
    }
}