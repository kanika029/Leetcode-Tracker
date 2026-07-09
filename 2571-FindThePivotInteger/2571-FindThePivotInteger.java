// Last updated: 7/9/2026, 3:05:51 PM
class Solution {
    public int pivotInteger(int n) {
        for ( int x= 1; x<=n;x++){
            int left = 0;
            int right = 0;
            for( int i = 0; i<=x;i++){
                left+=i;
            }
            for( int i=x;i<=n;i++){
                right+=i;
            }
            if(left == right) return x;
        }
        return -1;
    }
}