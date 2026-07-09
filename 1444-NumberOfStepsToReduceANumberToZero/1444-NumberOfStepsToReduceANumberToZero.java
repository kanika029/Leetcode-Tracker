// Last updated: 7/9/2026, 3:06:29 PM
class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while (num>0){
            if (num%2==0) num/=2;
            else num-=1;
            step+=1;
        }
        return step;
    }
}