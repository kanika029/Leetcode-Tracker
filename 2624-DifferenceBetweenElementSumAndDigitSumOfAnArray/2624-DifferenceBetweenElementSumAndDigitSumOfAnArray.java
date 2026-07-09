// Last updated: 7/9/2026, 3:05:48 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int snums = 0;
        int dsum=0;
        for( int x : nums){
            snums+=x;
            int s= x;
            while( s!=0){
                dsum+=s%10;
                s/=10;
            }
        }
        return snums-dsum;
    }
}