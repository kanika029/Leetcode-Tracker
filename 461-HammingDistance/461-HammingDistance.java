// Last updated: 7/9/2026, 3:07:42 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int b = x^y;
        while (b!=0){
             b = (b&(b-1));
             count++;
        }
        return count;
    }
}