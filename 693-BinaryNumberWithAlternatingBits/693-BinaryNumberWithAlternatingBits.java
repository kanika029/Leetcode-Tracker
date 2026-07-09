// Last updated: 7/9/2026, 3:07:15 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int y = (n ^ (n>>1));
        return (y&(y+1))==0?true:false;
    }
}
