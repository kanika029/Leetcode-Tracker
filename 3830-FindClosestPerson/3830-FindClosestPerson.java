// Last updated: 7/9/2026, 3:05:20 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = (x>z)?x-z:z-x;
        int d2 = (y>z)?y-z:z-y;

        if(d1<d2){
            return 1;
        }else if( d2<d1){
            return 2;
        }else{
            return 0;
        }
    }
}