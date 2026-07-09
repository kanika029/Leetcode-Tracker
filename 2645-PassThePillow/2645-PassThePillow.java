// Last updated: 7/9/2026, 3:05:46 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cyc = time/(n-1);
        int rem = time%(n-1);
        if(cyc%2==0){
            return rem+1;
        }else{
            return n-rem;
        }
    }
}
