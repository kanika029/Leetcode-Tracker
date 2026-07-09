// Last updated: 7/9/2026, 3:05:49 PM
class Solution {
    public int countDigits(int num) {
        int count =0;
        int org = num;
        while(num!=0){
            int d = num%10;
            if(d!=0 && org % d ==0) count++;
            num/=10;
        }
        return count;
    }
}