// Last updated: 7/9/2026, 3:06:37 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int eve=0 , odd =0;
        for (int i:position){
            if(i%2==0){
                eve++;
            }else{
                odd++;
            }
        }
        return eve<odd?eve:odd;
    }
}