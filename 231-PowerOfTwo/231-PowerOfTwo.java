// Last updated: 7/9/2026, 3:08:24 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n%2==0){
            n/=2;

        }
        return n==1;
    }
}