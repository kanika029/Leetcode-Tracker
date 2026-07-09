// Last updated: 7/9/2026, 3:05:39 PM
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x = num;
        for ( int i = 0;i<t;i++){
            x-=1;
            num+=1;
        }
        return num+t;
    }
}