// Last updated: 7/9/2026, 3:05:37 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dis =0;
        while(mainTank>=5){
            mainTank-=5;
            dis+=50;
            if (additionalTank>=1){
            additionalTank-=1;
            mainTank+=1;
            }
        }
        return dis+mainTank*10;
    }
}