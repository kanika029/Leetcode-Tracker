// Last updated: 7/9/2026, 3:05:12 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int d = 0;
        int sq = 0;
        while(n>0){
            int dig = n % 10;
            d = d+dig;
            sq = sq + (dig * dig);
            n/=10;
        }
        if(sq-d>=50){
            return true;
        }
        return false;
    }
}